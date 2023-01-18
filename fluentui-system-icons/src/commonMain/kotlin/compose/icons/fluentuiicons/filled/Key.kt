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

public val FilledGroup.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.9492f, 8.5998f)
                curveTo(8.9492f, 4.9856f, 11.885f, 2.0498f, 15.4992f, 2.0498f)
                curveTo(19.0963f, 2.0498f, 22.0492f, 4.8687f, 22.0492f, 8.4998f)
                curveTo(22.0492f, 12.114f, 19.1134f, 15.0498f, 15.4992f, 15.0498f)
                curveTo(14.9689f, 15.0498f, 14.4451f, 14.9738f, 13.9484f, 14.846f)
                curveTo(13.9241f, 15.515f, 13.3741f, 16.0498f, 12.6992f, 16.0498f)
                horizontalLineTo(10.9492f)
                verticalLineTo(17.7998f)
                curveTo(10.9492f, 18.4902f, 10.3896f, 19.0498f, 9.6992f, 19.0498f)
                horizontalLineTo(7.9492f)
                verticalLineTo(20.2998f)
                curveTo(7.9492f, 21.2663f, 7.1657f, 22.0498f, 6.1992f, 22.0498f)
                horizontalLineTo(3.6992f)
                curveTo(2.7327f, 22.0498f, 1.9492f, 21.2663f, 1.9492f, 20.2998f)
                verticalLineTo(18.1282f)
                curveTo(1.9492f, 17.3989f, 2.239f, 16.6994f, 2.7547f, 16.1837f)
                lineTo(8.9905f, 9.9479f)
                curveTo(9.0449f, 9.8934f, 9.0775f, 9.8053f, 9.0597f, 9.7038f)
                curveTo(8.9994f, 9.3602f, 8.9492f, 8.987f, 8.9492f, 8.5998f)
                close()
                moveTo(18.2493f, 6.9998f)
                curveTo(18.2493f, 6.3095f, 17.6896f, 5.7498f, 16.9993f, 5.7498f)
                curveTo(16.3089f, 5.7498f, 15.7493f, 6.3095f, 15.7493f, 6.9998f)
                curveTo(15.7493f, 7.6902f, 16.3089f, 8.2498f, 16.9993f, 8.2498f)
                curveTo(17.6896f, 8.2498f, 18.2493f, 7.6902f, 18.2493f, 6.9998f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
