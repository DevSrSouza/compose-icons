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

public val SolidGroup.StoreAlt: ImageVector
    get() {
        if (_storeAlt != null) {
            return _storeAlt!!
        }
        _storeAlt = Builder(name = "StoreAlt", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 384.0f)
                lineTo(128.0f, 384.0f)
                lineTo(128.0f, 224.0f)
                lineTo(64.0f, 224.0f)
                verticalLineToRelative(256.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(256.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(384.0f, 224.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(160.0f)
                close()
                moveTo(634.6f, 142.2f)
                lineToRelative(-85.3f, -128.0f)
                curveToRelative(-6.0f, -8.9f, -16.0f, -14.2f, -26.7f, -14.2f)
                lineTo(117.4f, -0.0f)
                curveToRelative(-10.7f, 0.0f, -20.7f, 5.3f, -26.6f, 14.2f)
                lineToRelative(-85.3f, 128.0f)
                curveToRelative(-14.2f, 21.3f, 1.0f, 49.8f, 26.6f, 49.8f)
                lineTo(608.0f, 192.0f)
                curveToRelative(25.5f, 0.0f, 40.7f, -28.5f, 26.6f, -49.8f)
                close()
                moveTo(512.0f, 496.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(576.0f, 224.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(272.0f)
                close()
            }
        }
        .build()
        return _storeAlt!!
    }

private var _storeAlt: ImageVector? = null
