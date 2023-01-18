package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.DocumentLandscapeData: ImageVector
    get() {
        if (_documentLandscapeData != null) {
            return _documentLandscapeData!!
        }
        _documentLandscapeData = Builder(name = "DocumentLandscapeData", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.75f)
                curveTo(2.0f, 5.2312f, 3.2312f, 4.0f, 4.75f, 4.0f)
                horizontalLineTo(19.25f)
                curveTo(20.7688f, 4.0f, 22.0f, 5.2312f, 22.0f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(22.0f, 18.7688f, 20.7688f, 20.0f, 19.25f, 20.0f)
                horizontalLineTo(4.75f)
                curveTo(3.2312f, 20.0f, 2.0f, 18.7688f, 2.0f, 17.25f)
                verticalLineTo(6.75f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(10.8954f, 7.0f, 10.0f, 7.8954f, 10.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(10.0f, 16.1046f, 10.8954f, 17.0f, 12.0f, 17.0f)
                curveTo(13.1046f, 17.0f, 14.0f, 16.1046f, 14.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(14.0f, 7.8954f, 13.1046f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(7.0f, 12.0f)
                curveTo(5.8954f, 12.0f, 5.0f, 12.8954f, 5.0f, 14.0f)
                verticalLineTo(15.0f)
                curveTo(5.0f, 16.1046f, 5.8954f, 17.0f, 7.0f, 17.0f)
                curveTo(8.1046f, 17.0f, 9.0f, 16.1046f, 9.0f, 15.0f)
                verticalLineTo(14.0f)
                curveTo(9.0f, 12.8954f, 8.1046f, 12.0f, 7.0f, 12.0f)
                close()
                moveTo(15.0f, 12.0f)
                verticalLineTo(15.0f)
                curveTo(15.0f, 16.1046f, 15.8954f, 17.0f, 17.0f, 17.0f)
                curveTo(18.1046f, 17.0f, 19.0f, 16.1046f, 19.0f, 15.0f)
                verticalLineTo(12.0f)
                curveTo(19.0f, 10.8954f, 18.1046f, 10.0f, 17.0f, 10.0f)
                curveTo(15.8954f, 10.0f, 15.0f, 10.8954f, 15.0f, 12.0f)
                close()
            }
        }
        .build()
        return _documentLandscapeData!!
    }

private var _documentLandscapeData: ImageVector? = null
