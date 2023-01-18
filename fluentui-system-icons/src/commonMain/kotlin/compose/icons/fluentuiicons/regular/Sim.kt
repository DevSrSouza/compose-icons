package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Sim: ImageVector
    get() {
        if (_sim != null) {
            return _sim!!
        }
        _sim = Builder(name = "Sim", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.75f, 10.0f)
                curveTo(8.2312f, 10.0f, 7.0f, 11.2312f, 7.0f, 12.75f)
                verticalLineTo(16.25f)
                curveTo(7.0f, 17.7688f, 8.2312f, 19.0f, 9.75f, 19.0f)
                horizontalLineTo(14.25f)
                curveTo(15.7688f, 19.0f, 17.0f, 17.7688f, 17.0f, 16.25f)
                verticalLineTo(12.75f)
                curveTo(17.0f, 11.2312f, 15.7688f, 10.0f, 14.25f, 10.0f)
                horizontalLineTo(9.75f)
                close()
                moveTo(8.5f, 12.75f)
                curveTo(8.5f, 12.0596f, 9.0596f, 11.5f, 9.75f, 11.5f)
                horizontalLineTo(12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(12.75f)
                close()
                moveTo(8.5f, 15.5f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.5f)
                horizontalLineTo(9.75f)
                curveTo(9.0596f, 17.5f, 8.5f, 16.9404f, 8.5f, 16.25f)
                verticalLineTo(15.5f)
                close()
                moveTo(13.5f, 17.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(14.25f)
                curveTo(14.9404f, 11.5f, 15.5f, 12.0596f, 15.5f, 12.75f)
                verticalLineTo(16.25f)
                curveTo(15.5f, 16.9404f, 14.9404f, 17.5f, 14.25f, 17.5f)
                horizontalLineTo(13.5f)
                close()
                moveTo(7.25f, 2.0f)
                curveTo(5.4551f, 2.0f, 4.0f, 3.4551f, 4.0f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(4.0f, 20.5449f, 5.4551f, 22.0f, 7.25f, 22.0f)
                horizontalLineTo(16.75f)
                curveTo(18.5449f, 22.0f, 20.0f, 20.5449f, 20.0f, 18.75f)
                verticalLineTo(9.2855f)
                curveTo(20.0f, 8.4236f, 19.6576f, 7.5969f, 19.0481f, 6.9874f)
                lineTo(15.0126f, 2.9519f)
                curveTo(14.4031f, 2.3424f, 13.5764f, 2.0f, 12.7145f, 2.0f)
                horizontalLineTo(7.25f)
                close()
                moveTo(5.5f, 5.25f)
                curveTo(5.5f, 4.2835f, 6.2835f, 3.5f, 7.25f, 3.5f)
                horizontalLineTo(12.7145f)
                curveTo(13.1786f, 3.5f, 13.6237f, 3.6844f, 13.9519f, 4.0126f)
                lineTo(17.9874f, 8.0481f)
                curveTo(18.3156f, 8.3763f, 18.5f, 8.8214f, 18.5f, 9.2855f)
                verticalLineTo(18.75f)
                curveTo(18.5f, 19.7165f, 17.7165f, 20.5f, 16.75f, 20.5f)
                horizontalLineTo(7.25f)
                curveTo(6.2835f, 20.5f, 5.5f, 19.7165f, 5.5f, 18.75f)
                verticalLineTo(5.25f)
                close()
            }
        }
        .build()
        return _sim!!
    }

private var _sim: ImageVector? = null
