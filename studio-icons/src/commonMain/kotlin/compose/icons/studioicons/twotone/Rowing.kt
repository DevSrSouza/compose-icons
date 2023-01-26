package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Rowing: ImageVector
    get() {
        if (_rowing != null) {
            return _rowing!!
        }
        _rowing = Builder(name = "Rowing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 14.5f)
                lineTo(4.0f, 19.0f)
                lineToRelative(1.5f, 1.5f)
                lineTo(9.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-2.5f, -2.5f)
                close()
                moveTo(15.0f, 1.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(21.0f, 21.01f)
                lineTo(18.0f, 24.0f)
                lineToRelative(-2.99f, -3.01f)
                lineTo(15.01f, 19.5f)
                lineToRelative(-7.1f, -7.09f)
                curveToRelative(-0.31f, 0.05f, -0.61f, 0.07f, -0.91f, 0.07f)
                verticalLineToRelative(-2.16f)
                curveToRelative(1.66f, 0.03f, 3.61f, -0.87f, 4.67f, -2.04f)
                lineToRelative(1.4f, -1.55f)
                curveToRelative(0.19f, -0.21f, 0.43f, -0.38f, 0.69f, -0.5f)
                curveToRelative(0.29f, -0.14f, 0.62f, -0.23f, 0.96f, -0.23f)
                horizontalLineToRelative(0.03f)
                curveTo(15.99f, 6.01f, 17.0f, 7.02f, 17.0f, 8.26f)
                verticalLineToRelative(5.75f)
                curveToRelative(0.0f, 0.84f, -0.35f, 1.61f, -0.92f, 2.16f)
                lineToRelative(-3.58f, -3.58f)
                verticalLineToRelative(-2.27f)
                curveToRelative(-0.63f, 0.52f, -1.43f, 1.02f, -2.29f, 1.39f)
                lineTo(16.5f, 18.0f)
                lineTo(18.0f, 18.0f)
                lineToRelative(3.0f, 3.01f)
                close()
            }
        }
        .build()
        return _rowing!!
    }

private var _rowing: ImageVector? = null
