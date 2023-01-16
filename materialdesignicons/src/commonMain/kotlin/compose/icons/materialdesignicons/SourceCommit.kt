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

public val MaterialDesignIcons.SourceCommit: ImageVector
    get() {
        if (_sourceCommit != null) {
            return _sourceCommit!!
        }
        _sourceCommit = Builder(name = "SourceCommit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 12.0f)
                curveTo(17.0f, 14.42f, 15.28f, 16.44f, 13.0f, 16.9f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.9f)
                curveTo(8.72f, 16.44f, 7.0f, 14.42f, 7.0f, 12.0f)
                curveTo(7.0f, 9.58f, 8.72f, 7.56f, 11.0f, 7.1f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.1f)
                curveTo(15.28f, 7.56f, 17.0f, 9.58f, 17.0f, 12.0f)
                moveTo(12.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _sourceCommit!!
    }

private var _sourceCommit: ImageVector? = null
