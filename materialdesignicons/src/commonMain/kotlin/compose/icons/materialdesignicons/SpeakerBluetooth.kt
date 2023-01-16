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

public val MaterialDesignIcons.SpeakerBluetooth: ImageVector
    get() {
        if (_speakerBluetooth != null) {
            return _speakerBluetooth!!
        }
        _speakerBluetooth = Builder(name = "SpeakerBluetooth", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 21.0f)
                horizontalLineTo(12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 3.0f)
                horizontalLineTo(4.0f)
                moveTo(8.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 5.0f)
                moveTo(19.0f, 7.0f)
                verticalLineTo(10.79f)
                lineTo(16.71f, 8.5f)
                lineTo(16.0f, 9.21f)
                lineTo(18.79f, 12.0f)
                lineTo(16.0f, 14.79f)
                lineTo(16.71f, 15.5f)
                lineTo(19.0f, 13.21f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.5f)
                lineTo(22.35f, 14.14f)
                lineTo(20.21f, 12.0f)
                lineTo(22.35f, 9.85f)
                lineTo(19.5f, 7.0f)
                horizontalLineTo(19.0f)
                moveTo(20.0f, 8.91f)
                lineTo(20.94f, 9.85f)
                lineTo(20.0f, 10.79f)
                verticalLineTo(8.91f)
                moveTo(8.0f, 11.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 15.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 19.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 4.0f, 15.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 11.0f)
                moveTo(8.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 13.0f)
                moveTo(20.0f, 13.21f)
                lineTo(20.94f, 14.14f)
                lineTo(20.0f, 15.08f)
                verticalLineTo(13.21f)
                close()
            }
        }
        .build()
        return _speakerBluetooth!!
    }

private var _speakerBluetooth: ImageVector? = null
