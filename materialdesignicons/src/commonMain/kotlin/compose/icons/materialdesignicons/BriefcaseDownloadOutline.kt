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

public val MaterialDesignIcons.BriefcaseDownloadOutline: ImageVector
    get() {
        if (_briefcaseDownloadOutline != null) {
            return _briefcaseDownloadOutline!!
        }
        _briefcaseDownloadOutline = Builder(name = "BriefcaseDownloadOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                lineTo(7.0f, 13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                lineTo(12.0f, 18.0f)
                moveTo(10.0f, 2.0f)
                horizontalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 8.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 21.0f, 2.0f, 20.1f, 2.0f, 19.0f)
                verticalLineTo(8.0f)
                curveTo(2.0f, 6.89f, 2.89f, 6.0f, 4.0f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                curveTo(8.0f, 2.89f, 8.89f, 2.0f, 10.0f, 2.0f)
                moveTo(14.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                moveTo(4.0f, 8.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _briefcaseDownloadOutline!!
    }

private var _briefcaseDownloadOutline: ImageVector? = null
