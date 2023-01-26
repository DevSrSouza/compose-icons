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

public val TwotoneGroup.SendTimeExtension: ImageVector
    get() {
        if (_sendTimeExtension != null) {
            return _sendTimeExtension!!
        }
        _sendTimeExtension = Builder(name = "SendTimeExtension", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveTo(11.0f, 3.72f, 11.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(5.01f)
                verticalLineToRelative(2.13f)
                curveTo(7.17f, 8.94f, 8.0f, 11.01f, 8.0f, 12.5f)
                curveToRelative(0.0f, 1.5f, -0.83f, 3.57f, -3.0f, 4.37f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(2.13f)
                curveToRelative(0.71f, -1.93f, 2.44f, -2.8f, 3.87f, -2.97f)
                verticalLineTo(12.0f)
                verticalLineTo(8.76f)
                lineToRelative(2.89f, 1.45f)
                lineTo(18.0f, 12.26f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.13f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-2.13f)
                curveToRelative(2.17f, -0.8f, 3.0f, -2.87f, 3.0f, -4.37f)
                curveToRelative(0.0f, -1.49f, -0.83f, -3.56f, -2.99f, -4.37f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveTo(12.0f, 3.72f, 12.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.26f)
                lineToRelative(2.0f, 1.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveTo(9.0f, 2.62f, 9.0f, 4.0f)
                horizontalLineTo(5.01f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(3.8f)
                curveTo(5.7f, 9.8f, 6.0f, 11.96f, 6.0f, 12.5f)
                curveToRelative(0.0f, 0.54f, -0.29f, 2.7f, -3.0f, 2.7f)
                verticalLineTo(19.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(3.8f)
                curveToRelative(0.0f, -2.16f, 1.37f, -2.78f, 2.2f, -2.94f)
                verticalLineToRelative(-2.03f)
                curveTo(9.57f, 16.2f, 7.85f, 17.07f, 7.13f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 12.0f)
                lineToRelative(0.0f, 4.0f)
                lineToRelative(4.0f, 1.0f)
                lineToRelative(-4.0f, 1.0f)
                lineToRelative(0.0f, 4.0f)
                lineToRelative(10.0f, -5.0f)
                close()
            }
        }
        .build()
        return _sendTimeExtension!!
    }

private var _sendTimeExtension: ImageVector? = null
