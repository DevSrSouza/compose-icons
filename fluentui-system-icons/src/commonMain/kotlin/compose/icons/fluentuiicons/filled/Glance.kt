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

public val FilledGroup.Glance: ImageVector
    get() {
        if (_glance != null) {
            return _glance!!
        }
        _glance = Builder(name = "Glance", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.2501f, 11.0017f)
                curveTo(20.2166f, 11.0017f, 21.0001f, 11.7852f, 21.0001f, 12.7517f)
                verticalLineTo(19.2517f)
                curveTo(21.0001f, 20.2182f, 20.2166f, 21.0017f, 19.2501f, 21.0017f)
                horizontalLineTo(14.7501f)
                curveTo(13.7836f, 21.0017f, 13.0001f, 20.2182f, 13.0001f, 19.2517f)
                verticalLineTo(12.7517f)
                curveTo(13.0001f, 11.7852f, 13.7836f, 11.0017f, 14.7501f, 11.0017f)
                horizontalLineTo(19.2501f)
                close()
                moveTo(9.2683f, 15.0141f)
                curveTo(10.2348f, 15.0141f, 11.0183f, 15.7976f, 11.0183f, 16.7641f)
                verticalLineTo(19.2517f)
                curveTo(11.0183f, 20.2182f, 10.2348f, 21.0017f, 9.2683f, 21.0017f)
                horizontalLineTo(4.7539f)
                curveTo(3.7874f, 21.0017f, 3.0039f, 20.2182f, 3.0039f, 19.2517f)
                verticalLineTo(16.7641f)
                curveTo(3.0039f, 15.7976f, 3.7874f, 15.0141f, 4.7539f, 15.0141f)
                horizontalLineTo(9.2683f)
                close()
                moveTo(9.2539f, 3.0f)
                curveTo(10.2204f, 3.0f, 11.0039f, 3.7835f, 11.0039f, 4.75f)
                verticalLineTo(11.25f)
                curveTo(11.0039f, 12.1682f, 10.2968f, 12.9212f, 9.3974f, 12.9942f)
                lineTo(9.2539f, 13.0f)
                horizontalLineTo(4.7539f)
                curveTo(3.7874f, 13.0f, 3.0039f, 12.2165f, 3.0039f, 11.25f)
                verticalLineTo(4.75f)
                curveTo(3.0039f, 3.7835f, 3.7874f, 3.0f, 4.7539f, 3.0f)
                horizontalLineTo(9.2539f)
                close()
                moveTo(19.2501f, 3.0f)
                curveTo(20.2166f, 3.0f, 21.0001f, 3.7835f, 21.0001f, 4.75f)
                verticalLineTo(7.25f)
                curveTo(21.0001f, 8.2165f, 20.2166f, 9.0f, 19.2501f, 9.0f)
                horizontalLineTo(14.7501f)
                curveTo(13.7836f, 9.0f, 13.0001f, 8.2165f, 13.0001f, 7.25f)
                verticalLineTo(4.75f)
                curveTo(13.0001f, 3.7835f, 13.7836f, 3.0f, 14.7501f, 3.0f)
                horizontalLineTo(19.2501f)
                close()
            }
        }
        .build()
        return _glance!!
    }

private var _glance: ImageVector? = null
