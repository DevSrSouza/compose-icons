package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Translate: ImageVector
    get() {
        if (_translate != null) {
            return _translate!!
        }
        _translate = Builder(name = "Translate", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.7f, 210.6f)
                lineToRelative(-56.0f, -112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -21.4f, 0.0f)
                lineToRelative(-20.5f, 41.0f)
                arcTo(84.2f, 84.2f, 0.0f, false, true, 106.0f, 126.2f)
                arcTo(107.3f, 107.3f, 0.0f, false, false, 131.3f, 68.0f)
                horizontalLineTo(152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(100.0f)
                verticalLineTo(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineTo(44.0f)
                horizontalLineTo(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(83.1f)
                arcTo(83.3f, 83.3f, 0.0f, false, true, 88.0f, 110.3f)
                arcTo(83.8f, 83.8f, 0.0f, false, true, 75.6f, 91.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -21.8f, 10.0f)
                arcTo(103.4f, 103.4f, 0.0f, false, false, 70.0f, 126.2f)
                arcTo(83.3f, 83.3f, 0.0f, false, true, 24.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                arcToRelative(107.0f, 107.0f, 0.0f, false, false, 64.0f, -21.1f)
                arcToRelative(108.3f, 108.3f, 0.0f, false, false, 45.4f, 19.4f)
                lineToRelative(-24.1f, 48.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 21.4f, 10.8f)
                lineTo(143.4f, 196.0f)
                horizontalLineToRelative(65.2f)
                lineToRelative(12.7f, 25.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 21.4f, -10.8f)
                close()
                moveTo(155.4f, 172.0f)
                lineTo(176.0f, 130.8f)
                lineTo(196.6f, 172.0f)
                close()
            }
        }
        .build()
        return _translate!!
    }

private var _translate: ImageVector? = null
