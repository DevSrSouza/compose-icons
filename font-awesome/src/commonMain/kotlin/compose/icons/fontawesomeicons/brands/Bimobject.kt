package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Bimobject: ImageVector
    get() {
        if (_bimobject != null) {
            return _bimobject!!
        }
        _bimobject = Builder(name = "Bimobject", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 32.0f)
                lineTo(32.0f, 32.0f)
                curveTo(14.4f, 32.0f, 0.0f, 46.4f, 0.0f, 64.0f)
                verticalLineToRelative(384.0f)
                curveToRelative(0.0f, 17.6f, 14.4f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(384.0f)
                curveToRelative(17.6f, 0.0f, 32.0f, -14.4f, 32.0f, -32.0f)
                lineTo(448.0f, 64.0f)
                curveToRelative(0.0f, -17.6f, -14.4f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(352.0f, 289.4f)
                curveToRelative(0.0f, 49.4f, -11.4f, 82.6f, -103.8f, 82.6f)
                horizontalLineToRelative(-16.9f)
                curveToRelative(-44.1f, 0.0f, -62.4f, -14.9f, -70.4f, -38.8f)
                horizontalLineToRelative(-0.9f)
                lineTo(160.0f, 368.0f)
                lineTo(96.0f, 368.0f)
                lineTo(96.0f, 136.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(74.7f)
                horizontalLineToRelative(1.1f)
                curveToRelative(4.6f, -30.5f, 39.7f, -38.8f, 69.7f, -38.8f)
                horizontalLineToRelative(17.3f)
                curveToRelative(92.4f, 0.0f, 103.8f, 33.1f, 103.8f, 82.5f)
                verticalLineToRelative(35.0f)
                close()
                moveTo(288.0f, 260.5f)
                verticalLineToRelative(22.9f)
                curveToRelative(0.0f, 21.7f, -3.4f, 33.8f, -38.4f, 33.8f)
                horizontalLineToRelative(-45.3f)
                curveToRelative(-28.9f, 0.0f, -44.1f, -6.5f, -44.1f, -35.7f)
                verticalLineToRelative(-19.0f)
                curveToRelative(0.0f, -29.3f, 15.2f, -35.7f, 44.1f, -35.7f)
                horizontalLineToRelative(45.3f)
                curveToRelative(35.0f, -0.2f, 38.4f, 12.0f, 38.4f, 33.7f)
                close()
            }
        }
        .build()
        return _bimobject!!
    }

private var _bimobject: ImageVector? = null
