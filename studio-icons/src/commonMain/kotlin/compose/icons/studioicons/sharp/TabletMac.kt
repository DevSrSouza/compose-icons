package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.TabletMac: ImageVector
    get() {
        if (_tabletMac != null) {
            return _tabletMac!!
        }
        _tabletMac = Builder(name = "TabletMac", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                lineTo(2.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(19.0f)
                lineTo(21.0f, 0.0f)
                close()
                moveTo(11.5f, 23.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(19.0f, 19.0f)
                lineTo(4.0f, 19.0f)
                lineTo(4.0f, 3.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _tabletMac!!
    }

private var _tabletMac: ImageVector? = null
