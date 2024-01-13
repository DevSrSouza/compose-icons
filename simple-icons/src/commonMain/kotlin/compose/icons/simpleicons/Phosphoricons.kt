package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Phosphoricons: ImageVector
    get() {
        if (_phosphoricons != null) {
            return _phosphoricons!!
        }
        _phosphoricons = Builder(name = "Phosphoricons", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.404f, 0.001f)
                lineTo(3.866f, 0.001f)
                arcToRelative(0.618f, 0.618f, 0.0f, false, false, -0.619f, 0.619f)
                verticalLineToRelative(15.173f)
                arcTo(8.217f, 8.217f, 0.0f, false, false, 11.449f, 24.0f)
                arcToRelative(0.617f, 0.617f, 0.0f, false, false, 0.618f, -0.619f)
                verticalLineToRelative(-6.969f)
                horizontalLineToRelative(0.332f)
                arcToRelative(8.204f, 8.204f, 0.0f, false, false, 7.715f, -5.031f)
                arcToRelative(8.216f, 8.216f, 0.0f, false, false, 0.0f, -6.349f)
                arcTo(8.214f, 8.214f, 0.0f, false, false, 12.399f, 0.001f)
                horizontalLineToRelative(0.005f)
                close()
                moveTo(10.825f, 22.737f)
                arcToRelative(6.98f, 6.98f, 0.0f, false, true, -6.317f, -6.317f)
                horizontalLineToRelative(6.317f)
                verticalLineToRelative(6.317f)
                close()
                moveTo(10.825f, 13.175f)
                lineTo(4.869f, 1.238f)
                horizontalLineToRelative(5.967f)
                lineToRelative(-0.011f, 11.937f)
                close()
                moveTo(12.404f, 15.175f)
                horizontalLineToRelative(-0.331f)
                lineTo(12.073f, 1.238f)
                horizontalLineToRelative(0.331f)
                arcToRelative(6.975f, 6.975f, 0.0f, false, true, 5.016f, 1.993f)
                arcToRelative(6.986f, 6.986f, 0.0f, false, true, 1.546f, 2.277f)
                arcToRelative(6.987f, 6.987f, 0.0f, false, true, 0.0f, 5.397f)
                arcToRelative(6.975f, 6.975f, 0.0f, false, true, -6.562f, 4.27f)
                close()
            }
        }
        .build()
        return _phosphoricons!!
    }

private var _phosphoricons: ImageVector? = null
