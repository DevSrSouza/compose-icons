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

public val TwotoneGroup.ReportOff: ImageVector
    get() {
        if (_reportOff != null) {
            return _reportOff!!
        }
        _reportOff = Builder(name = "ReportOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 9.1f)
                lineTo(14.9f, 5.0f)
                horizontalLineTo(9.1f)
                lineToRelative(-0.22f, 0.22f)
                lineTo(11.0f, 7.33f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.33f)
                lineToRelative(5.78f, 5.79f)
                lineToRelative(0.22f, -0.22f)
                close()
                moveTo(6.05f, 8.04f)
                lineTo(5.0f, 9.1f)
                verticalLineToRelative(5.8f)
                lineTo(9.1f, 19.0f)
                horizontalLineToRelative(5.8f)
                lineToRelative(1.05f, -1.05f)
                lineToRelative(-9.9f, -9.91f)
                close()
                moveTo(13.0f, 16.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.1f, 5.0f)
                horizontalLineToRelative(5.8f)
                lineTo(19.0f, 9.1f)
                verticalLineToRelative(5.8f)
                lineToRelative(-0.22f, 0.22f)
                lineToRelative(1.42f, 1.41f)
                lineToRelative(0.8f, -0.8f)
                verticalLineTo(8.27f)
                lineTo(15.73f, 3.0f)
                horizontalLineTo(8.27f)
                lineToRelative(-0.8f, 0.8f)
                lineToRelative(1.41f, 1.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.33f)
                lineToRelative(2.0f, 2.0f)
                close()
                moveTo(2.41f, 1.58f)
                lineTo(1.0f, 2.99f)
                lineToRelative(3.64f, 3.64f)
                lineTo(3.0f, 8.27f)
                verticalLineToRelative(7.46f)
                lineTo(8.27f, 21.0f)
                horizontalLineToRelative(7.46f)
                lineToRelative(1.64f, -1.64f)
                lineTo(21.01f, 23.0f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.41f, 1.58f)
                close()
                moveTo(14.9f, 19.0f)
                horizontalLineTo(9.1f)
                lineTo(5.0f, 14.9f)
                verticalLineTo(9.1f)
                lineToRelative(1.05f, -1.05f)
                lineToRelative(9.9f, 9.9f)
                lineTo(14.9f, 19.0f)
                close()
            }
        }
        .build()
        return _reportOff!!
    }

private var _reportOff: ImageVector? = null
