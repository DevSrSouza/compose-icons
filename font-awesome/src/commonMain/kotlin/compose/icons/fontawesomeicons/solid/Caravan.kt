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

public val SolidGroup.Caravan: ImageVector
    get() {
        if (_caravan != null) {
            return _caravan!!
        }
        _caravan = Builder(name = "Caravan", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 416.0f, 208.0f)
                close()
                moveTo(624.0f, 320.0f)
                lineTo(576.0f, 320.0f)
                lineTo(576.0f, 160.0f)
                arcTo(160.0f, 160.0f, 0.0f, false, false, 416.0f, 0.0f)
                lineTo(64.0f, 0.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 0.0f, 64.0f)
                lineTo(0.0f, 320.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, 64.0f)
                lineTo(96.0f, 384.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, false, 192.0f, 0.0f)
                lineTo(624.0f, 384.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(640.0f, 336.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 624.0f, 320.0f)
                close()
                moveTo(192.0f, 432.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, -48.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 192.0f, 432.0f)
                close()
                moveTo(256.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                lineTo(96.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f)
                lineTo(64.0f, 128.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 96.0f, 96.0f)
                lineTo(224.0f, 96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                close()
                moveTo(448.0f, 320.0f)
                lineTo(320.0f, 320.0f)
                lineTo(320.0f, 128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _caravan!!
    }

private var _caravan: ImageVector? = null
