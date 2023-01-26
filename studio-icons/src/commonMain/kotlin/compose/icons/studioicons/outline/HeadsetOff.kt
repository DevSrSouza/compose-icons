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

public val OutlineGroup.HeadsetOff: ImageVector
    get() {
        if (_headsetOff != null) {
            return _headsetOff!!
        }
        _headsetOff = Builder(name = "HeadsetOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(3.87f, 0.0f, 7.0f, 3.13f, 7.0f, 7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(0.17f)
                lineTo(16.83f, 14.0f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(2.17f)
                lineToRelative(2.0f, 2.0f)
                verticalLineTo(11.0f)
                curveToRelative(0.0f, -4.97f, -4.03f, -9.0f, -9.0f, -9.0f)
                curveTo(9.98f, 2.0f, 8.12f, 2.67f, 6.62f, 3.8f)
                lineToRelative(1.43f, 1.43f)
                curveTo(9.17f, 4.45f, 10.53f, 4.0f, 12.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.1f, 2.1f)
                lineTo(0.69f, 3.51f)
                lineToRelative(3.33f, 3.33f)
                curveTo(3.37f, 8.09f, 3.0f, 9.5f, 3.0f, 11.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.94f, 0.19f, -1.83f, 0.52f, -2.65f)
                lineTo(15.0f, 17.83f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(2.17f)
                lineToRelative(1.0f, 1.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.34f, 0.0f, 0.65f, -0.09f, 0.93f, -0.24f)
                lineToRelative(0.55f, 0.55f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.1f, 2.1f)
                close()
                moveTo(7.0f, 14.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _headsetOff!!
    }

private var _headsetOff: ImageVector? = null
