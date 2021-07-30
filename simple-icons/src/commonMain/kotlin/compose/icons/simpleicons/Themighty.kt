package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Themighty: ImageVector
    get() {
        if (_themighty != null) {
            return _themighty!!
        }
        _themighty = Builder(name = "Themighty", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.178f, 0.001f)
                horizontalLineToRelative(-4.432f)
                lineTo(12.05f, 13.988f)
                lineTo(9.309f, 0.001f)
                horizontalLineTo(4.856f)
                curveToRelative(0.216f, 0.219f, 0.334f, 0.634f, 0.39f, 1.072f)
                verticalLineToRelative(21.21f)
                curveToRelative(0.0f, 0.621f, -0.105f, 1.383f, -0.425f, 1.717f)
                curveToRelative(1.014f, -0.214f, 2.307f, -0.416f, 3.414f, -0.611f)
                verticalLineTo(9.375f)
                lineToRelative(2.489f, 12.375f)
                curveToRelative(0.07f, 0.46f, 0.135f, 1.084f, -0.021f, 1.198f)
                curveToRelative(0.847f, -0.129f, 1.694f, -0.252f, 2.544f, -0.366f)
                curveToRelative(-0.105f, -0.16f, -0.064f, -0.652f, -0.005f, -1.061f)
                lineTo(15.696f, 9.15f)
                verticalLineToRelative(13.095f)
                curveToRelative(1.054f, -0.123f, 2.366f, -0.24f, 3.47f, -0.349f)
                lineToRelative(0.012f, -0.008f)
                curveToRelative(-0.324f, -0.328f, -0.43f, -1.1f, -0.43f, -1.724f)
                verticalLineTo(1.726f)
                curveToRelative(0.0f, -0.627f, 0.105f, -1.396f, 0.43f, -1.726f)
                verticalLineToRelative(0.001f)
                close()
            }
        }
        .build()
        return _themighty!!
    }

private var _themighty: ImageVector? = null
