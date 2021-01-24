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

public val SolidGroup.StoreAltSlash: ImageVector
    get() {
        if (_storeAltSlash != null) {
            return _storeAltSlash!!
        }
        _storeAltSlash = Builder(name = "StoreAltSlash", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.89f, 123.62f)
                lineTo(5.51f, 142.2f)
                curveToRelative(-14.2f, 21.3f, 1.0f, 49.8f, 26.59f, 49.8f)
                horizontalLineToRelative(74.26f)
                close()
                moveTo(576.0f, 413.42f)
                verticalLineTo(224.0f)
                horizontalLineTo(512.0f)
                verticalLineTo(364.0f)
                lineTo(384.0f, 265.0f)
                verticalLineTo(224.0f)
                horizontalLineTo(330.92f)
                lineToRelative(-41.4f, -32.0f)
                horizontalLineTo(608.0f)
                curveToRelative(25.5f, 0.0f, 40.7f, -28.5f, 26.59f, -49.8f)
                lineToRelative(-85.29f, -128.0f)
                arcTo(32.18f, 32.18f, 0.0f, false, false, 522.6f, 0.0f)
                horizontalLineTo(117.42f)
                arcTo(31.87f, 31.87f, 0.0f, false, false, 90.81f, 14.2f)
                lineToRelative(-10.66f, 16.0f)
                lineTo(45.46f, 3.38f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 23.0f, 6.19f)
                lineTo(3.37f, 31.46f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 6.18f, 53.91f)
                lineTo(594.53f, 508.63f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 617.0f, 505.81f)
                lineToRelative(19.64f, -25.26f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -2.81f, -22.45f)
                close()
                moveTo(320.0f, 384.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(224.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(480.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineTo(352.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                verticalLineTo(406.59f)
                lineToRelative(-64.0f, -49.47f)
                close()
            }
        }
        .build()
        return _storeAltSlash!!
    }

private var _storeAltSlash: ImageVector? = null
