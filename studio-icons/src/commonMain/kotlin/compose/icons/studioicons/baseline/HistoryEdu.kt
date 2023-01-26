package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.HistoryEdu: ImageVector
    get() {
        if (_historyEdu != null) {
            return _historyEdu!!
        }
        _historyEdu = Builder(name = "HistoryEdu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                verticalLineToRelative(1.38f)
                curveToRelative(-0.83f, -0.33f, -1.72f, -0.5f, -2.61f, -0.5f)
                curveToRelative(-1.79f, 0.0f, -3.58f, 0.68f, -4.95f, 2.05f)
                lineToRelative(3.33f, 3.33f)
                horizontalLineToRelative(1.11f)
                verticalLineToRelative(1.11f)
                curveToRelative(0.86f, 0.86f, 1.98f, 1.31f, 3.11f, 1.36f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(7.89f, 10.41f)
                verticalLineTo(8.26f)
                horizontalLineTo(5.61f)
                lineTo(4.57f, 7.22f)
                curveTo(5.14f, 7.0f, 5.76f, 6.88f, 6.39f, 6.88f)
                curveToRelative(1.34f, 0.0f, 2.59f, 0.52f, 3.54f, 1.46f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-0.2f, 0.2f)
                curveToRelative(-0.51f, 0.51f, -1.19f, 0.8f, -1.92f, 0.8f)
                curveTo(8.75f, 10.75f, 8.29f, 10.63f, 7.89f, 10.41f)
                close()
                moveTo(19.0f, 17.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.59f)
                curveToRelative(0.57f, -0.23f, 1.1f, -0.57f, 1.56f, -1.03f)
                lineToRelative(0.2f, -0.2f)
                lineTo(15.59f, 14.0f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(-1.41f)
                lineToRelative(-6.0f, -5.97f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _historyEdu!!
    }

private var _historyEdu: ImageVector? = null
