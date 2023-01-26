package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Construction: ImageVector
    get() {
        if (_construction != null) {
            return _construction!!
        }
        _construction = Builder(name = "Construction", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7827f, 15.1719f)
                lineToRelative(2.1213f, -2.1213f)
                lineToRelative(5.9962f, 5.9962f)
                lineToRelative(-2.1213f, 2.1213f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 10.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -0.58f, -0.16f, -1.12f, -0.41f, -1.6f)
                lineToRelative(-2.7f, 2.7f)
                lineTo(16.4f, 6.11f)
                lineToRelative(2.7f, -2.7f)
                curveTo(18.62f, 3.16f, 18.08f, 3.0f, 17.5f, 3.0f)
                curveTo(15.57f, 3.0f, 14.0f, 4.57f, 14.0f, 6.5f)
                curveToRelative(0.0f, 0.41f, 0.08f, 0.8f, 0.21f, 1.16f)
                lineToRelative(-1.85f, 1.85f)
                lineToRelative(-1.78f, -1.78f)
                lineToRelative(0.71f, -0.71f)
                lineTo(9.88f, 5.61f)
                lineTo(12.0f, 3.49f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0.0f)
                lineTo(4.22f, 7.03f)
                lineToRelative(1.41f, 1.41f)
                horizontalLineTo(2.81f)
                lineTo(2.1f, 9.15f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(0.71f, -0.71f)
                verticalLineTo(9.15f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(1.78f, 1.78f)
                lineToRelative(-7.41f, 7.41f)
                lineToRelative(2.12f, 2.12f)
                lineTo(16.34f, 9.79f)
                curveTo(16.7f, 9.92f, 17.09f, 10.0f, 17.5f, 10.0f)
                close()
            }
        }
        .build()
        return _construction!!
    }

private var _construction: ImageVector? = null
