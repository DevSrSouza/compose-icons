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

public val MaterialDesignIcons.Metronome: ImageVector
    get() {
        if (_metronome != null) {
            return _metronome!!
        }
        _metronome = Builder(name = "Metronome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.75f)
                lineTo(8.57f, 2.67f)
                lineTo(4.06f, 19.53f)
                curveTo(4.03f, 19.68f, 4.0f, 19.84f, 4.0f, 20.0f)
                curveTo(4.0f, 21.11f, 4.89f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 22.0f, 20.0f, 21.11f, 20.0f, 20.0f)
                curveTo(20.0f, 19.84f, 19.97f, 19.68f, 19.94f, 19.53f)
                lineTo(18.58f, 14.42f)
                lineTo(17.0f, 16.0f)
                lineTo(17.2f, 17.0f)
                horizontalLineTo(13.41f)
                lineTo(16.25f, 14.16f)
                lineTo(14.84f, 12.75f)
                lineTo(10.59f, 17.0f)
                horizontalLineTo(6.8f)
                lineTo(10.29f, 4.0f)
                horizontalLineTo(13.71f)
                lineTo(15.17f, 9.43f)
                lineTo(16.8f, 7.79f)
                lineTo(15.43f, 2.67f)
                lineTo(12.0f, 1.75f)
                moveTo(11.25f, 5.0f)
                verticalLineTo(14.75f)
                lineTo(12.75f, 13.25f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.25f)
                moveTo(19.79f, 7.8f)
                lineTo(16.96f, 10.63f)
                lineTo(16.25f, 9.92f)
                lineTo(14.84f, 11.34f)
                lineTo(17.66f, 14.16f)
                lineTo(19.08f, 12.75f)
                lineTo(18.37f, 12.04f)
                lineTo(21.2f, 9.21f)
                lineTo(19.79f, 7.8f)
                close()
            }
        }
        .build()
        return _metronome!!
    }

private var _metronome: ImageVector? = null
