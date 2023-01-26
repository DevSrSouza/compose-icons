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

public val TwotoneGroup.PersonAddDisabled: ImageVector
    get() {
        if (_personAddDisabled != null) {
            return _personAddDisabled!!
        }
        _personAddDisabled = Builder(name = "PersonAddDisabled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 18.0f)
                horizontalLineToRelative(5.87f)
                lineTo(13.0f, 16.13f)
                lineToRelative(-1.1f, 0.3f)
                curveTo(9.89f, 16.99f, 9.08f, 17.76f, 9.0f, 18.0f)
                close()
                moveTo(17.0f, 8.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                curveToRelative(-0.99f, 0.0f, -1.81f, 0.72f, -1.97f, 1.67f)
                lineToRelative(2.31f, 2.31f)
                curveTo(16.27f, 9.82f, 17.0f, 8.99f, 17.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.48f, 11.95f)
                curveToRelative(0.17f, 0.02f, 0.34f, 0.05f, 0.52f, 0.05f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f)
                curveToRelative(0.0f, 0.18f, 0.03f, 0.35f, 0.05f, 0.52f)
                lineToRelative(3.43f, 3.43f)
                close()
                moveTo(15.0f, 6.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.99f, -0.73f, 1.82f, -1.67f, 1.97f)
                lineToRelative(-2.31f, -2.31f)
                curveTo(13.19f, 6.72f, 14.01f, 6.0f, 15.0f, 6.0f)
                close()
                moveTo(16.69f, 14.16f)
                lineTo(22.53f, 20.0f)
                lineTo(23.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.14f, -3.56f, -3.5f, -6.31f, -3.84f)
                close()
                moveTo(0.0f, 3.12f)
                lineToRelative(4.0f, 4.0f)
                lineTo(4.0f, 10.0f)
                lineTo(1.0f, 10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.88f)
                lineToRelative(2.51f, 2.51f)
                curveTo(9.19f, 15.11f, 7.0f, 16.3f, 7.0f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.88f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(1.41f, -1.41f)
                lineTo(1.41f, 1.71f)
                lineTo(0.0f, 3.12f)
                close()
                moveTo(13.01f, 16.13f)
                lineTo(14.88f, 18.0f)
                lineTo(9.0f, 18.0f)
                curveToRelative(0.08f, -0.24f, 0.88f, -1.01f, 2.91f, -1.57f)
                lineToRelative(1.1f, -0.3f)
                close()
                moveTo(6.0f, 9.12f)
                lineToRelative(0.88f, 0.88f)
                lineTo(6.0f, 10.0f)
                verticalLineToRelative(-0.88f)
                close()
            }
        }
        .build()
        return _personAddDisabled!!
    }

private var _personAddDisabled: ImageVector? = null
