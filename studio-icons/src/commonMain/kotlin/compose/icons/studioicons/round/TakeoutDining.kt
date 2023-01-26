package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.TakeoutDining: ImageVector
    get() {
        if (_takeoutDining != null) {
            return _takeoutDining!!
        }
        _takeoutDining = Builder(name = "TakeoutDining", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.29f, 6.75f)
                curveToRelative(-0.39f, -0.39f, -1.01f, -0.39f, -1.4f, 0.0f)
                lineTo(19.0f, 7.63f)
                lineToRelative(0.03f, -0.56f)
                lineToRelative(-3.46f, -3.48f)
                curveTo(15.19f, 3.21f, 14.68f, 3.0f, 14.15f, 3.0f)
                horizontalLineToRelative(-4.3f)
                curveTo(9.32f, 3.0f, 8.81f, 3.21f, 8.43f, 3.59f)
                lineTo(4.97f, 7.07f)
                lineTo(5.0f, 7.57f)
                lineTo(4.11f, 6.7f)
                curveTo(3.72f, 6.32f, 3.1f, 6.32f, 2.72f, 6.71f)
                lineTo(2.7f, 6.73f)
                curveTo(2.32f, 7.12f, 2.32f, 7.75f, 2.72f, 8.13f)
                lineTo(4.66f, 10.0f)
                horizontalLineToRelative(14.69f)
                lineToRelative(1.92f, -1.84f)
                curveTo(21.67f, 7.78f, 21.68f, 7.14f, 21.29f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.79f, 18.15f)
                curveTo(5.87f, 19.19f, 6.74f, 20.0f, 7.79f, 20.0f)
                horizontalLineToRelative(8.43f)
                curveToRelative(1.05f, 0.0f, 1.92f, -0.81f, 1.99f, -1.85f)
                lineToRelative(0.49f, -6.6f)
                horizontalLineTo(5.3f)
                lineTo(5.79f, 18.15f)
                close()
            }
        }
        .build()
        return _takeoutDining!!
    }

private var _takeoutDining: ImageVector? = null
