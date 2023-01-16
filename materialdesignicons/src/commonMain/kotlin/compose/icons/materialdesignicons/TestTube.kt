package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.TestTube: ImageVector
    get() {
        if (_testTube != null) {
            return _testTube!!
        }
        _testTube = Builder(name = "TestTube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 18.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.0f)
                moveTo(11.0f, 16.0f)
                curveTo(10.4f, 16.0f, 10.0f, 15.6f, 10.0f, 15.0f)
                curveTo(10.0f, 14.4f, 10.4f, 14.0f, 11.0f, 14.0f)
                curveTo(11.6f, 14.0f, 12.0f, 14.4f, 12.0f, 15.0f)
                curveTo(12.0f, 15.6f, 11.6f, 16.0f, 11.0f, 16.0f)
                moveTo(13.0f, 12.0f)
                curveTo(12.4f, 12.0f, 12.0f, 11.6f, 12.0f, 11.0f)
                curveTo(12.0f, 10.4f, 12.4f, 10.0f, 13.0f, 10.0f)
                curveTo(13.6f, 10.0f, 14.0f, 10.4f, 14.0f, 11.0f)
                curveTo(14.0f, 11.6f, 13.6f, 12.0f, 13.0f, 12.0f)
                moveTo(14.0f, 7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _testTube!!
    }

private var _testTube: ImageVector? = null
