package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Interests: ImageVector
    get() {
        if (_interests != null) {
            return _interests!!
        }
        _interests = Builder(name = "Interests", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.02f, 13.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f)
                reflectiveCurveTo(9.23f, 13.0f, 7.02f, 13.0f)
                close()
                moveTo(13.0f, 13.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(7.0f, 2.0f)
                lineToRelative(-5.0f, 9.0f)
                horizontalLineToRelative(10.0f)
                lineTo(7.0f, 2.0f)
                close()
                moveTo(19.25f, 2.5f)
                curveToRelative(-1.06f, 0.0f, -1.81f, 0.56f, -2.25f, 1.17f)
                curveToRelative(-0.44f, -0.61f, -1.19f, -1.17f, -2.25f, -1.17f)
                curveTo(13.19f, 2.5f, 12.0f, 3.78f, 12.0f, 5.25f)
                curveToRelative(0.0f, 2.0f, 2.42f, 3.42f, 5.0f, 5.75f)
                curveToRelative(2.58f, -2.33f, 5.0f, -3.75f, 5.0f, -5.75f)
                curveTo(22.0f, 3.78f, 20.81f, 2.5f, 19.25f, 2.5f)
                close()
            }
        }
        .build()
        return _interests!!
    }

private var _interests: ImageVector? = null
