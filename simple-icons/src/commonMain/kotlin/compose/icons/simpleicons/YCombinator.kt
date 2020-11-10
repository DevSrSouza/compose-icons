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

public val SimpleIcons.YCombinator: VectorAsset
    get() {
        if (_yCombinator != null) {
            return _yCombinator!!
        }
        _yCombinator = VectorAssetBuilder(name = "YCombinator", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 24.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineTo(0.0f)
                close()
                moveTo(6.951f, 5.896f)
                lineToRelative(4.112f, 7.708f)
                verticalLineToRelative(5.064f)
                horizontalLineToRelative(1.583f)
                verticalLineToRelative(-4.972f)
                lineToRelative(4.148f, -7.799f)
                horizontalLineToRelative(-1.749f)
                lineToRelative(-2.457f, 4.875f)
                curveToRelative(-0.372f, 0.745f, -0.688f, 1.434f, -0.688f, 1.434f)
                reflectiveCurveToRelative(-0.297f, -0.708f, -0.651f, -1.434f)
                lineTo(8.831f, 5.896f)
                horizontalLineToRelative(-1.88f)
                close()
            }
        }
        .build()
        return _yCombinator!!
    }

private var _yCombinator: VectorAsset? = null
