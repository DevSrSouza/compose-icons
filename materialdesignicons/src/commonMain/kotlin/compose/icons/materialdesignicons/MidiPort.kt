package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.MidiPort: ImageVector
    get() {
        if (_midiPort != null) {
            return _midiPort!!
        }
        _midiPort = Builder(name = "MidiPort", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(20.18f, 12.0f)
                curveTo(20.18f, 8.18f, 17.55f, 4.96f, 14.0f, 4.07f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.07f)
                curveTo(6.45f, 4.96f, 3.82f, 8.18f, 3.82f, 12.0f)
                arcTo(8.18f, 8.18f, 0.0f, false, false, 12.0f, 20.18f)
                arcTo(8.18f, 8.18f, 0.0f, false, false, 20.18f, 12.0f)
                moveTo(7.0f, 10.64f)
                arcTo(1.36f, 1.36f, 0.0f, false, true, 8.36f, 12.0f)
                arcTo(1.36f, 1.36f, 0.0f, false, true, 7.0f, 13.36f)
                curveTo(6.25f, 13.36f, 5.64f, 12.75f, 5.64f, 12.0f)
                curveTo(5.64f, 11.25f, 6.25f, 10.64f, 7.0f, 10.64f)
                moveTo(17.0f, 10.64f)
                arcTo(1.36f, 1.36f, 0.0f, false, true, 18.36f, 12.0f)
                arcTo(1.36f, 1.36f, 0.0f, false, true, 17.0f, 13.36f)
                arcTo(1.36f, 1.36f, 0.0f, false, true, 15.64f, 12.0f)
                arcTo(1.36f, 1.36f, 0.0f, false, true, 17.0f, 10.64f)
                moveTo(8.36f, 14.27f)
                arcTo(1.37f, 1.37f, 0.0f, false, true, 9.73f, 15.64f)
                curveTo(9.73f, 16.39f, 9.12f, 17.0f, 8.36f, 17.0f)
                arcTo(1.36f, 1.36f, 0.0f, false, true, 7.0f, 15.64f)
                curveTo(7.0f, 14.88f, 7.61f, 14.27f, 8.36f, 14.27f)
                moveTo(15.64f, 14.27f)
                curveTo(16.39f, 14.27f, 17.0f, 14.88f, 17.0f, 15.64f)
                arcTo(1.36f, 1.36f, 0.0f, false, true, 15.64f, 17.0f)
                curveTo(14.88f, 17.0f, 14.27f, 16.39f, 14.27f, 15.64f)
                arcTo(1.37f, 1.37f, 0.0f, false, true, 15.64f, 14.27f)
                moveTo(12.0f, 15.64f)
                arcTo(1.36f, 1.36f, 0.0f, false, true, 13.36f, 17.0f)
                arcTo(1.36f, 1.36f, 0.0f, false, true, 12.0f, 18.36f)
                arcTo(1.36f, 1.36f, 0.0f, false, true, 10.64f, 17.0f)
                arcTo(1.36f, 1.36f, 0.0f, false, true, 12.0f, 15.64f)
                close()
            }
        }
        .build()
        return _midiPort!!
    }

private var _midiPort: ImageVector? = null
