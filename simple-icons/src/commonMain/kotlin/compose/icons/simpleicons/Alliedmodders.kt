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

public val SimpleIcons.Alliedmodders: VectorAsset
    get() {
        if (_alliedmodders != null) {
            return _alliedmodders!!
        }
        _alliedmodders = VectorAssetBuilder(name = "Alliedmodders", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.602f, 1.077f)
                arcTo(0.615f, 0.615f, 0.0f, false, false, 0.0f, 1.692f)
                verticalLineToRelative(20.615f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, false, 0.615f, 0.615f)
                horizontalLineToRelative(8.309f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, false, 0.615f, -0.615f)
                verticalLineToRelative(-1.744f)
                lineToRelative(0.647f, 1.94f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, false, 0.584f, 0.42f)
                horizontalLineToRelative(6.77f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, false, 0.585f, -0.427f)
                lineToRelative(0.035f, -0.107f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, false, 0.61f, 0.533f)
                horizontalLineToRelative(4.615f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, false, 0.615f, -0.615f)
                lineTo(24.0f, 8.155f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, false, -0.447f, -0.592f)
                lineTo(19.246f, 6.33f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, false, -0.744f, 0.372f)
                lineToRelative(-1.887f, 4.906f)
                lineTo(16.615f, 6.059f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, false, -0.443f, -0.592f)
                lineToRelative(-3.385f, -0.98f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, false, -0.787f, 0.59f)
                verticalLineToRelative(6.15f)
                lineToRelative(-2.809f, -7.48f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, false, -0.408f, -0.377f)
                lineToRelative(-8.0f, -2.27f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, false, -0.181f, -0.023f)
                close()
                moveTo(1.23f, 2.507f)
                lineToRelative(6.918f, 1.962f)
                lineToRelative(3.891f, 10.363f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, false, 1.191f, -0.216f)
                verticalLineToRelative(-8.72f)
                lineToRelative(2.155f, 0.624f)
                verticalLineToRelative(8.402f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, false, 1.19f, 0.223f)
                lineToRelative(2.874f, -7.475f)
                lineToRelative(3.32f, 0.948f)
                verticalLineToRelative(13.074f)
                horizontalLineToRelative(-3.384f)
                verticalLineToRelative(-1.23f)
                horizontalLineToRelative(1.23f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, false, 0.615f, -0.616f)
                lineTo(21.23f, 12.77f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, false, -1.2f, -0.19f)
                lineToRelative(-2.94f, 9.112f)
                horizontalLineToRelative(-5.877f)
                lineTo(6.738f, 8.266f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, false, -1.199f, 0.195f)
                verticalLineToRelative(11.076f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, false, 0.615f, 0.618f)
                lineTo(8.31f, 20.155f)
                verticalLineToRelative(1.537f)
                lineTo(1.23f, 21.692f)
                close()
                moveTo(6.77f, 12.254f)
                lineToRelative(2.224f, 6.674f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, false, -0.07f, -0.006f)
                lineTo(6.77f, 18.922f)
                close()
                moveTo(20.0f, 16.682f)
                verticalLineToRelative(2.549f)
                horizontalLineToRelative(-0.822f)
                close()
            }
        }
        .build()
        return _alliedmodders!!
    }

private var _alliedmodders: VectorAsset? = null
