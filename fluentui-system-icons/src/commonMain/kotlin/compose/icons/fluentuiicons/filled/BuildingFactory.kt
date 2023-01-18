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

public val FilledGroup.BuildingFactory: ImageVector
    get() {
        if (_buildingFactory != null) {
            return _buildingFactory!!
        }
        _buildingFactory = Builder(name = "BuildingFactory", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.9232f, 4.1286f)
                curveTo(2.9877f, 2.9348f, 3.9745f, 2.0f, 5.1699f, 2.0f)
                horizontalLineTo(6.3277f)
                curveTo(7.5232f, 2.0f, 8.5099f, 2.9348f, 8.5744f, 4.1286f)
                lineTo(9.4123f, 19.6286f)
                curveTo(9.4819f, 20.917f, 8.4559f, 22.0f, 7.1656f, 22.0f)
                horizontalLineTo(4.3321f)
                curveTo(3.0417f, 22.0f, 2.0157f, 20.917f, 2.0854f, 19.6286f)
                lineTo(2.9232f, 4.1286f)
                close()
                moveTo(9.5108f, 22.0f)
                horizontalLineTo(19.7489f)
                curveTo(20.9915f, 22.0f, 21.9989f, 20.9926f, 21.9989f, 19.75f)
                verticalLineTo(6.0f)
                curveTo(21.9989f, 5.7021f, 21.8225f, 5.4324f, 21.5497f, 5.313f)
                curveTo(21.2768f, 5.1935f, 20.959f, 5.2468f, 20.7401f, 5.4489f)
                lineTo(15.4989f, 10.287f)
                verticalLineTo(6.0f)
                curveTo(15.4989f, 5.7021f, 15.3225f, 5.4324f, 15.0497f, 5.313f)
                curveTo(14.7768f, 5.1935f, 14.459f, 5.2468f, 14.2401f, 5.4489f)
                lineTo(9.8656f, 9.4869f)
                lineTo(10.4109f, 19.5746f)
                curveTo(10.4616f, 20.5125f, 10.1103f, 21.3751f, 9.5108f, 22.0f)
                close()
                moveTo(12.9988f, 16.0f)
                curveTo(12.9988f, 15.4477f, 13.4466f, 15.0f, 13.9988f, 15.0f)
                horizontalLineTo(17.9988f)
                curveTo(18.5511f, 15.0f, 18.9988f, 15.4477f, 18.9988f, 16.0f)
                verticalLineTo(20.5f)
                horizontalLineTo(12.9988f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _buildingFactory!!
    }

private var _buildingFactory: ImageVector? = null
