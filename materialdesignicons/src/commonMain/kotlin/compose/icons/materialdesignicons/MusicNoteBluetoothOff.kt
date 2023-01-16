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

public val MaterialDesignIcons.MusicNoteBluetoothOff: ImageVector
    get() {
        if (_musicNoteBluetoothOff != null) {
            return _musicNoteBluetoothOff!!
        }
        _musicNoteBluetoothOff = Builder(name = "MusicNoteBluetoothOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.85f)
                lineTo(19.14f, 7.0f)
                horizontalLineTo(18.64f)
                verticalLineTo(10.79f)
                lineTo(16.35f, 8.5f)
                lineTo(15.64f, 9.21f)
                lineTo(18.43f, 12.0f)
                lineTo(15.64f, 14.79f)
                lineTo(16.35f, 15.5f)
                lineTo(18.64f, 13.21f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.14f)
                lineTo(22.0f, 14.15f)
                lineTo(19.85f, 12.0f)
                lineTo(22.0f, 9.85f)
                moveTo(19.64f, 8.91f)
                lineTo(20.58f, 9.85f)
                lineTo(19.64f, 10.79f)
                verticalLineTo(8.91f)
                moveTo(20.58f, 14.15f)
                lineTo(19.64f, 15.09f)
                verticalLineTo(13.21f)
                lineTo(20.58f, 14.15f)
                moveTo(1.96f, 3.0f)
                lineTo(0.687f, 4.27f)
                lineTo(9.69f, 13.27f)
                verticalLineTo(13.55f)
                curveTo(9.1f, 13.21f, 8.42f, 13.0f, 7.69f, 13.0f)
                curveTo(5.5f, 13.0f, 3.69f, 14.79f, 3.69f, 17.0f)
                reflectiveCurveTo(5.5f, 21.0f, 7.69f, 21.0f)
                reflectiveCurveTo(11.69f, 19.21f, 11.69f, 17.0f)
                verticalLineTo(15.27f)
                lineTo(17.42f, 21.0f)
                lineTo(18.69f, 19.73f)
                lineTo(1.96f, 3.0f)
                moveTo(11.69f, 7.0f)
                horizontalLineTo(15.69f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.69f)
                verticalLineTo(8.18f)
                lineTo(11.69f, 10.18f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _musicNoteBluetoothOff!!
    }

private var _musicNoteBluetoothOff: ImageVector? = null
