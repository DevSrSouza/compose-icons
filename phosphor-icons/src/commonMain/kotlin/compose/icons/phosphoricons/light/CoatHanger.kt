package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.CoatHanger: ImageVector
    get() {
        if (_coatHanger != null) {
            return _coatHanger!!
        }
        _coatHanger = Builder(name = "CoatHanger", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.4f, 172.8f)
                lineTo(138.0f, 96.0f)
                lineToRelative(25.6f, -19.2f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 166.0f, 72.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -76.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 51.8f, -2.9f)
                lineToRelative(-29.3f, 22.0f)
                lineToRelative(-0.2f, 0.2f)
                lineTo(15.6f, 172.8f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 24.0f, 198.0f)
                lineTo(232.0f, 198.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 8.4f, -25.2f)
                close()
                moveTo(233.9f, 184.6f)
                arcTo(1.8f, 1.8f, 0.0f, false, true, 232.0f, 186.0f)
                lineTo(24.0f, 186.0f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -1.9f, -1.4f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 0.7f, -2.2f)
                lineTo(128.0f, 103.5f)
                lineToRelative(105.2f, 78.9f)
                arcTo(1.8f, 1.8f, 0.0f, false, true, 233.9f, 184.6f)
                close()
            }
        }
        .build()
        return _coatHanger!!
    }

private var _coatHanger: ImageVector? = null
