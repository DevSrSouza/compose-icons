package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.OnDeviceTraining: ImageVector
    get() {
        if (_onDeviceTraining != null) {
            return _onDeviceTraining!!
        }
        _onDeviceTraining = Builder(name = "OnDeviceTraining", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                curveToRelative(0.0f, 0.74f, 0.4f, 1.38f, 1.0f, 1.72f)
                verticalLineToRelative(0.78f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-0.78f)
                curveToRelative(0.6f, -0.35f, 1.0f, -0.98f, 1.0f, -1.72f)
                curveTo(14.0f, 11.9f, 13.1f, 11.0f, 12.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 1.01f)
                lineTo(6.0f, 1.0f)
                curveTo(4.9f, 1.0f, 4.0f, 1.9f, 4.0f, 3.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(3.0f)
                curveTo(20.0f, 1.9f, 19.1f, 1.01f, 18.0f, 1.01f)
                close()
                moveTo(18.0f, 21.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(21.0f)
                close()
                moveTo(18.0f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(18.0f, 4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.01f, 15.95f)
                curveTo(16.63f, 15.12f, 17.0f, 14.11f, 17.0f, 13.0f)
                reflectiveCurveToRelative(-0.37f, -2.12f, -0.99f, -2.95f)
                lineToRelative(-1.07f, 1.07f)
                curveToRelative(0.35f, 0.54f, 0.56f, 1.19f, 0.56f, 1.88f)
                reflectiveCurveToRelative(-0.21f, 1.34f, -0.56f, 1.88f)
                lineTo(16.01f, 15.95f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.06f, 14.88f)
                curveTo(8.71f, 14.34f, 8.5f, 13.69f, 8.5f, 13.0f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                verticalLineToRelative(1.25f)
                lineToRelative(2.25f, -2.0f)
                lineToRelative(-2.25f, -2.0f)
                verticalLineTo(8.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                curveToRelative(0.0f, 1.11f, 0.37f, 2.12f, 0.99f, 2.95f)
                lineTo(9.06f, 14.88f)
                close()
            }
        }
        .build()
        return _onDeviceTraining!!
    }

private var _onDeviceTraining: ImageVector? = null
