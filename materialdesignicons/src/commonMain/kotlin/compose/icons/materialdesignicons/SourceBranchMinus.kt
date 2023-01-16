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

public val MaterialDesignIcons.SourceBranchMinus: ImageVector
    get() {
        if (_sourceBranchMinus != null) {
            return _sourceBranchMinus!!
        }
        _sourceBranchMinus = Builder(name = "SourceBranchMinus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 14.0f)
                curveTo(9.64f, 14.0f, 8.54f, 15.35f, 8.18f, 16.24f)
                curveTo(9.25f, 16.7f, 10.0f, 17.76f, 10.0f, 19.0f)
                curveTo(10.0f, 20.66f, 8.66f, 22.0f, 7.0f, 22.0f)
                reflectiveCurveTo(4.0f, 20.66f, 4.0f, 19.0f)
                curveTo(4.0f, 17.69f, 4.83f, 16.58f, 6.0f, 16.17f)
                verticalLineTo(7.83f)
                curveTo(4.83f, 7.42f, 4.0f, 6.31f, 4.0f, 5.0f)
                curveTo(4.0f, 3.34f, 5.34f, 2.0f, 7.0f, 2.0f)
                reflectiveCurveTo(10.0f, 3.34f, 10.0f, 5.0f)
                curveTo(10.0f, 6.31f, 9.17f, 7.42f, 8.0f, 7.83f)
                verticalLineTo(13.12f)
                curveTo(8.88f, 12.47f, 10.16f, 12.0f, 12.0f, 12.0f)
                curveTo(14.67f, 12.0f, 15.56f, 10.66f, 15.85f, 9.77f)
                curveTo(14.77f, 9.32f, 14.0f, 8.25f, 14.0f, 7.0f)
                curveTo(14.0f, 5.34f, 15.34f, 4.0f, 17.0f, 4.0f)
                reflectiveCurveTo(20.0f, 5.34f, 20.0f, 7.0f)
                curveTo(20.0f, 8.34f, 19.12f, 9.5f, 17.91f, 9.86f)
                curveTo(17.65f, 11.29f, 16.68f, 14.0f, 13.0f, 14.0f)
                moveTo(7.0f, 18.0f)
                curveTo(6.45f, 18.0f, 6.0f, 18.45f, 6.0f, 19.0f)
                reflectiveCurveTo(6.45f, 20.0f, 7.0f, 20.0f)
                reflectiveCurveTo(8.0f, 19.55f, 8.0f, 19.0f)
                reflectiveCurveTo(7.55f, 18.0f, 7.0f, 18.0f)
                moveTo(7.0f, 4.0f)
                curveTo(6.45f, 4.0f, 6.0f, 4.45f, 6.0f, 5.0f)
                reflectiveCurveTo(6.45f, 6.0f, 7.0f, 6.0f)
                reflectiveCurveTo(8.0f, 5.55f, 8.0f, 5.0f)
                reflectiveCurveTo(7.55f, 4.0f, 7.0f, 4.0f)
                moveTo(17.0f, 6.0f)
                curveTo(16.45f, 6.0f, 16.0f, 6.45f, 16.0f, 7.0f)
                reflectiveCurveTo(16.45f, 8.0f, 17.0f, 8.0f)
                reflectiveCurveTo(18.0f, 7.55f, 18.0f, 7.0f)
                reflectiveCurveTo(17.55f, 6.0f, 17.0f, 6.0f)
                moveTo(14.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _sourceBranchMinus!!
    }

private var _sourceBranchMinus: ImageVector? = null
