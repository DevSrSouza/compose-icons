package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.SaveMultiple: ImageVector
    get() {
        if (_saveMultiple != null) {
            return _saveMultiple!!
        }
        _saveMultiple = Builder(name = "SaveMultiple", defaultWidth = 24.0.dp, defaultHeight =
                25.0.dp, viewportWidth = 24.0f, viewportHeight = 25.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.75f, 3.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.75f)
                curveTo(7.0f, 7.9926f, 8.0074f, 9.0f, 9.25f, 9.0f)
                horizontalLineTo(11.75f)
                curveTo(12.9926f, 9.0f, 14.0f, 7.9926f, 14.0f, 6.75f)
                verticalLineTo(3.765f)
                curveTo(14.3744f, 3.9263f, 14.7187f, 4.1581f, 15.0126f, 4.4519f)
                lineTo(17.0481f, 6.4874f)
                curveTo(17.6576f, 7.0969f, 18.0f, 7.9236f, 18.0f, 8.7855f)
                verticalLineTo(15.75f)
                curveTo(18.0f, 17.2688f, 16.7688f, 18.5f, 15.25f, 18.5f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.75f)
                curveTo(15.0f, 12.5074f, 13.9926f, 11.5f, 12.75f, 11.5f)
                horizontalLineTo(8.25f)
                curveTo(7.0074f, 11.5f, 6.0f, 12.5074f, 6.0f, 13.75f)
                verticalLineTo(18.5f)
                horizontalLineTo(5.75f)
                curveTo(4.2312f, 18.5f, 3.0f, 17.2688f, 3.0f, 15.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.7312f, 4.2312f, 3.5f, 5.75f, 3.5f)
                close()
                moveTo(7.5f, 18.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(13.75f)
                curveTo(13.5f, 13.3358f, 13.1642f, 13.0f, 12.75f, 13.0f)
                horizontalLineTo(8.25f)
                curveTo(7.8358f, 13.0f, 7.5f, 13.3358f, 7.5f, 13.75f)
                verticalLineTo(18.5f)
                close()
                moveTo(8.5f, 3.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(6.75f)
                curveTo(12.5f, 7.1642f, 12.1642f, 7.5f, 11.75f, 7.5f)
                horizontalLineTo(9.25f)
                curveTo(8.8358f, 7.5f, 8.5f, 7.1642f, 8.5f, 6.75f)
                verticalLineTo(3.5f)
                close()
                moveTo(10.7498f, 21.5001f)
                curveTo(9.3836f, 21.5001f, 8.1522f, 20.9234f, 7.2856f, 20.0001f)
                horizontalLineTo(16.2498f)
                curveTo(18.0447f, 20.0001f, 19.4998f, 18.545f, 19.4998f, 16.7501f)
                verticalLineTo(8.9395f)
                lineTo(20.0479f, 9.4875f)
                curveTo(20.6574f, 10.097f, 20.9998f, 10.9237f, 20.9998f, 11.7856f)
                verticalLineTo(16.7501f)
                curveTo(20.9998f, 19.3735f, 18.8731f, 21.5001f, 16.2498f, 21.5001f)
                horizontalLineTo(10.7498f)
                close()
            }
        }
        .build()
        return _saveMultiple!!
    }

private var _saveMultiple: ImageVector? = null
