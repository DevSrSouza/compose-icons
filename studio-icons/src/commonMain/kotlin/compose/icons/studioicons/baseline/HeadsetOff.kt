package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.HeadsetOff: ImageVector
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
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.92f)
                lineTo(21.0f, 17.92f)
                verticalLineTo(11.0f)
                curveToRelative(0.0f, -4.97f, -4.03f, -9.0f, -9.0f, -9.0f)
                curveToRelative(-1.95f, 0.0f, -3.76f, 0.62f, -5.23f, 1.68f)
                lineToRelative(1.44f, 1.44f)
                curveTo(9.3f, 4.41f, 10.6f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(2.27f, 1.72f)
                lineTo(1.0f, 3.0f)
                lineToRelative(3.33f, 3.32f)
                curveTo(3.49f, 7.68f, 3.0f, 9.29f, 3.0f, 11.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.17f, 0.29f, -2.26f, 0.79f, -3.22f)
                lineTo(15.0f, 17.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.3f, 0.0f, 0.59f, -0.06f, 0.86f, -0.14f)
                lineTo(21.0f, 23.0f)
                lineToRelative(1.27f, -1.27f)
                lineToRelative(-20.0f, -20.01f)
                close()
            }
        }
        .build()
        return _headsetOff!!
    }

private var _headsetOff: ImageVector? = null
