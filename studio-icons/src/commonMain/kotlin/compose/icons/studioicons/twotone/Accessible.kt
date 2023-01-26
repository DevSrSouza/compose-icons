package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Accessible: ImageVector
    get() {
        if (_accessible != null) {
            return _accessible!!
        }
        _accessible = Builder(name = "Accessible", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-1.54f, 0.02f, -3.09f, -0.75f, -4.07f, -1.83f)
                lineToRelative(-1.29f, -1.43f)
                curveToRelative(-0.17f, -0.19f, -0.38f, -0.34f, -0.61f, -0.45f)
                curveToRelative(-0.01f, 0.0f, -0.01f, -0.01f, -0.02f, -0.01f)
                lineTo(13.0f, 7.28f)
                curveToRelative(-0.35f, -0.2f, -0.75f, -0.3f, -1.19f, -0.26f)
                curveTo(10.76f, 7.11f, 10.0f, 8.04f, 10.0f, 9.09f)
                lineTo(10.0f, 15.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.45f)
                curveToRelative(1.29f, 1.07f, 3.25f, 1.94f, 5.0f, 1.95f)
                close()
                moveTo(12.83f, 18.0f)
                curveToRelative(-0.41f, 1.16f, -1.52f, 2.0f, -2.83f, 2.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.31f, 0.84f, -2.41f, 2.0f, -2.83f)
                lineTo(9.0f, 12.1f)
                curveToRelative(-2.28f, 0.46f, -4.0f, 2.48f, -4.0f, 4.9f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                curveToRelative(2.42f, 0.0f, 4.44f, -1.72f, 4.9f, -4.0f)
                horizontalLineToRelative(-2.07f)
                close()
            }
        }
        .build()
        return _accessible!!
    }

private var _accessible: ImageVector? = null
