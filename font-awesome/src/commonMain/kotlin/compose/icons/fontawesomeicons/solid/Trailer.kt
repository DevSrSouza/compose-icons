package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Trailer: ImageVector
    get() {
        if (_trailer != null) {
            return _trailer!!
        }
        _trailer = Builder(name = "Trailer", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(624.0f, 320.0f)
                lineTo(544.0f, 320.0f)
                lineTo(544.0f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(16.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 0.0f, 80.0f)
                lineTo(0.0f, 368.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(65.61f, 384.0f)
                curveToRelative(7.83f, -54.21f, 54.0f, -96.0f, 110.39f, -96.0f)
                reflectiveCurveToRelative(102.56f, 41.79f, 110.39f, 96.0f)
                lineTo(624.0f, 384.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(640.0f, 336.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 624.0f, 320.0f)
                close()
                moveTo(96.0f, 243.68f)
                arcToRelative(176.29f, 176.29f, 0.0f, false, false, -32.0f, 20.71f)
                lineTo(64.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(88.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                close()
                moveTo(192.0f, 225.14f)
                curveToRelative(-5.31f, -0.49f, -10.57f, -1.14f, -16.0f, -1.14f)
                reflectiveCurveToRelative(-10.69f, 0.65f, -16.0f, 1.14f)
                lineTo(160.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                close()
                moveTo(288.0f, 264.39f)
                arcToRelative(176.29f, 176.29f, 0.0f, false, false, -32.0f, -20.71f)
                lineTo(256.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                close()
                moveTo(384.0f, 320.0f)
                lineTo(352.0f, 320.0f)
                lineTo(352.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                close()
                moveTo(480.0f, 320.0f)
                lineTo(448.0f, 320.0f)
                lineTo(448.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                close()
                moveTo(176.0f, 320.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 80.0f, 80.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 176.0f, 320.0f)
                close()
                moveTo(176.0f, 432.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 176.0f, 432.0f)
                close()
            }
        }
        .build()
        return _trailer!!
    }

private var _trailer: ImageVector? = null
