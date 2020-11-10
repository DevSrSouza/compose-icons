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

public val SimpleIcons.MaterialDesignIcons: VectorAsset
    get() {
        if (_materialDesignIcons != null) {
            return _materialDesignIcons!!
        }
        _materialDesignIcons = VectorAssetBuilder(name = "MaterialDesignIcons", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(7.2f)
                verticalLineToRelative(2.4f)
                horizontalLineToRelative(9.6f)
                verticalLineTo(0.0f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(7.2f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(9.6f)
                horizontalLineTo(24.0f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(-7.2f)
                verticalLineToRelative(-2.4f)
                horizontalLineTo(7.2f)
                verticalLineTo(24.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-7.2f)
                horizontalLineToRelative(2.4f)
                verticalLineTo(7.2f)
                horizontalLineTo(0.0f)
                verticalLineTo(0.0f)
                moveToRelative(16.8f, 7.2f)
                verticalLineTo(4.8f)
                horizontalLineTo(7.2f)
                verticalLineToRelative(2.4f)
                horizontalLineTo(4.8f)
                verticalLineToRelative(9.6f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(2.4f)
                horizontalLineToRelative(9.6f)
                verticalLineToRelative(-2.4f)
                horizontalLineToRelative(2.4f)
                verticalLineTo(7.2f)
                horizontalLineToRelative(-2.4f)
                moveTo(2.4f, 2.4f)
                verticalLineToRelative(2.4f)
                horizontalLineToRelative(2.4f)
                verticalLineTo(2.4f)
                horizontalLineTo(2.4f)
                moveToRelative(16.8f, 0.0f)
                verticalLineToRelative(2.4f)
                horizontalLineToRelative(2.4f)
                verticalLineTo(2.4f)
                horizontalLineToRelative(-2.4f)
                moveTo(2.4f, 19.2f)
                verticalLineToRelative(2.4f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(-2.4f)
                horizontalLineTo(2.4f)
                moveToRelative(16.8f, 0.0f)
                verticalLineToRelative(2.4f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(-2.4f)
                close()
            }
        }
        .build()
        return _materialDesignIcons!!
    }

private var _materialDesignIcons: VectorAsset? = null
