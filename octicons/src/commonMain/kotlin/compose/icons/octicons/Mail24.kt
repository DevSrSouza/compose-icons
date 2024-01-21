package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Mail24: ImageVector
    get() {
        if (_mail24 != null) {
            return _mail24!!
        }
        _mail24 = Builder(name = "Mail24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.75f, 3.0f)
                horizontalLineToRelative(20.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(14.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.75f, 1.75f)
                lineTo(1.75f, 20.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 18.75f)
                verticalLineToRelative(-14.0f)
                curveTo(0.0f, 3.784f, 0.784f, 3.0f, 1.75f, 3.0f)
                close()
                moveTo(1.5f, 7.412f)
                lineTo(1.5f, 18.75f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(20.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(22.5f, 7.412f)
                lineToRelative(-9.52f, 6.433f)
                curveToRelative(-0.592f, 0.4f, -1.368f, 0.4f, -1.96f, 0.0f)
                close()
                moveTo(1.5f, 4.75f)
                verticalLineToRelative(0.852f)
                lineToRelative(10.36f, 7.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.28f, 0.0f)
                lineToRelative(10.36f, -7.0f)
                lineTo(22.5f, 4.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                lineTo(1.75f, 4.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                close()
            }
        }
        .build()
        return _mail24!!
    }

private var _mail24: ImageVector? = null
