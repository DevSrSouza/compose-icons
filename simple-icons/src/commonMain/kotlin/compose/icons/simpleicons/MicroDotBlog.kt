package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.MicroDotBlog: VectorAsset
    get() {
        if (_microDotBlog != null) {
            return _microDotBlog!!
        }
        _microDotBlog = VectorAssetBuilder(name = "MicroDotBlog", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.4f, 17.7f)
                curveToRelative(-2.0f, 2.6f, -1.0f, 4.8f, -0.3f, 5.9f)
                curveToRelative(0.3f, 0.4f, -0.1f, 0.4f, -0.3f, 0.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.0f, -2.7f)
                curveToRelative(-0.2f, -0.1f, -0.3f, -0.2f, -0.5f, -0.1f)
                curveToRelative(-1.4f, 0.4f, -2.8f, 0.7f, -4.3f, 0.6f)
                curveTo(5.4f, 21.8f, 0.0f, 17.0f, 0.0f, 11.0f)
                curveTo(0.0f, 5.0f, 5.4f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 4.9f, 12.0f, 11.0f)
                curveToRelative(0.0f, 2.5f, -1.0f, 4.8f, -2.6f, 6.7f)
                close()
                moveTo(12.0f, 14.0f)
                lineToRelative(3.2f, 2.2f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.6f, -0.4f)
                lineTo(14.6f, 12.0f)
                lineToRelative(3.1f, -2.4f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.2f, -0.6f)
                horizontalLineToRelative(-3.9f)
                lineToRelative(-1.3f, -3.8f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.6f, 0.0f)
                lineTo(10.4f, 9.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.1f, 0.7f)
                lineToRelative(3.0f, 2.4f)
                lineToRelative(-1.0f, 3.7f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.5f, 0.4f)
                lineTo(12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _microDotBlog!!
    }

private var _microDotBlog: VectorAsset? = null
