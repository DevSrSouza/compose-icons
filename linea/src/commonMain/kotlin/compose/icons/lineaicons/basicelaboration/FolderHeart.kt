package compose.icons.lineaicons.basicelaboration

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.BasicElaborationGroup

public val BasicElaborationGroup.FolderHeart: ImageVector
    get() {
        if (_folderHeart != null) {
            return _folderHeart!!
        }
        _folderHeart = Builder(name = "FolderHeart", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(63.0f, 18.0f)
                lineToRelative(0.0f, 36.0f)
                lineToRelative(-62.0f, 0.0f)
                lineToRelative(0.0f, -44.0f)
                lineToRelative(21.0f, 0.0f)
                lineToRelative(8.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 33.0f)
                curveToRelative(0.0f, 6.666f, 10.0f, 12.0f, 10.0f, 12.0f)
                reflectiveCurveToRelative(10.0f, -5.334f, 10.0f, -12.0f)
                curveToRelative(0.0f, -2.762f, -2.0f, -5.0f, -5.0f, -5.0f)
                curveToRelative(-2.762f, 0.0f, -5.0f, 2.238f, -5.0f, 5.0f)
                curveToRelative(0.0f, -2.762f, -2.238f, -5.0f, -5.0f, -5.0f)
                curveTo(24.0f, 28.0f, 22.0f, 30.238f, 22.0f, 33.0f)
                close()
            }
        }
        .build()
        return _folderHeart!!
    }

private var _folderHeart: ImageVector? = null
