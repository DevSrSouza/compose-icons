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

public val FilledGroup.BuildingRetailMore: ImageVector
    get() {
        if (_buildingRetailMore != null) {
            return _buildingRetailMore!!
        }
        _buildingRetailMore = Builder(name = "BuildingRetailMore", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.2202f, 3.0f)
                curveTo(5.6993f, 3.0f, 5.2055f, 3.232f, 4.8731f, 3.633f)
                lineTo(1.2921f, 7.9522f)
                curveTo(0.6166f, 8.7669f, 1.196f, 10.0f, 2.2543f, 10.0f)
                horizontalLineTo(21.7463f)
                curveTo(22.8046f, 10.0f, 23.3841f, 8.7669f, 22.7086f, 7.9522f)
                lineTo(19.1276f, 3.633f)
                curveTo(18.7952f, 3.232f, 18.3013f, 3.0f, 17.7804f, 3.0f)
                horizontalLineTo(6.2202f)
                close()
                moveTo(3.0f, 11.5f)
                verticalLineTo(18.75f)
                curveTo(3.0f, 20.1307f, 4.1193f, 21.25f, 5.5f, 21.25f)
                horizontalLineTo(18.5f)
                curveTo(19.8807f, 21.25f, 21.0f, 20.1307f, 21.0f, 18.75f)
                verticalLineTo(11.5f)
                horizontalLineTo(3.0f)
                close()
                moveTo(9.0f, 15.25f)
                curveTo(9.0f, 15.9404f, 8.4404f, 16.5f, 7.75f, 16.5f)
                curveTo(7.0596f, 16.5f, 6.5f, 15.9404f, 6.5f, 15.25f)
                curveTo(6.5f, 14.5596f, 7.0596f, 14.0f, 7.75f, 14.0f)
                curveTo(8.4404f, 14.0f, 9.0f, 14.5596f, 9.0f, 15.25f)
                close()
                moveTo(12.0f, 16.5f)
                curveTo(11.3096f, 16.5f, 10.75f, 15.9404f, 10.75f, 15.25f)
                curveTo(10.75f, 14.5596f, 11.3096f, 14.0f, 12.0f, 14.0f)
                curveTo(12.6904f, 14.0f, 13.25f, 14.5596f, 13.25f, 15.25f)
                curveTo(13.25f, 15.9404f, 12.6904f, 16.5f, 12.0f, 16.5f)
                close()
                moveTo(17.5f, 15.25f)
                curveTo(17.5f, 15.9404f, 16.9404f, 16.5f, 16.25f, 16.5f)
                curveTo(15.5596f, 16.5f, 15.0f, 15.9404f, 15.0f, 15.25f)
                curveTo(15.0f, 14.5596f, 15.5596f, 14.0f, 16.25f, 14.0f)
                curveTo(16.9404f, 14.0f, 17.5f, 14.5596f, 17.5f, 15.25f)
                close()
            }
        }
        .build()
        return _buildingRetailMore!!
    }

private var _buildingRetailMore: ImageVector? = null
