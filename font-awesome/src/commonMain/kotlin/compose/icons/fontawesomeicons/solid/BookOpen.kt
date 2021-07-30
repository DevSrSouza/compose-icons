package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.BookOpen: ImageVector
    get() {
        if (_bookOpen != null) {
            return _bookOpen!!
        }
        _bookOpen = Builder(name = "BookOpen", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(542.22f, 32.05f)
                curveToRelative(-54.8f, 3.11f, -163.72f, 14.43f, -230.96f, 55.59f)
                curveToRelative(-4.64f, 2.84f, -7.27f, 7.89f, -7.27f, 13.17f)
                verticalLineToRelative(363.87f)
                curveToRelative(0.0f, 11.55f, 12.63f, 18.85f, 23.28f, 13.49f)
                curveToRelative(69.18f, -34.82f, 169.23f, -44.32f, 218.7f, -46.92f)
                curveToRelative(16.89f, -0.89f, 30.02f, -14.43f, 30.02f, -30.66f)
                verticalLineTo(62.75f)
                curveToRelative(0.01f, -17.71f, -15.35f, -31.74f, -33.77f, -30.7f)
                close()
                moveTo(264.73f, 87.64f)
                curveTo(197.5f, 46.48f, 88.58f, 35.17f, 33.78f, 32.05f)
                curveTo(15.36f, 31.01f, 0.0f, 45.04f, 0.0f, 62.75f)
                verticalLineTo(400.6f)
                curveToRelative(0.0f, 16.24f, 13.13f, 29.78f, 30.02f, 30.66f)
                curveToRelative(49.49f, 2.6f, 149.59f, 12.11f, 218.77f, 46.95f)
                curveToRelative(10.62f, 5.35f, 23.21f, -1.94f, 23.21f, -13.46f)
                verticalLineTo(100.63f)
                curveToRelative(0.0f, -5.29f, -2.62f, -10.14f, -7.27f, -12.99f)
                close()
            }
        }
        .build()
        return _bookOpen!!
    }

private var _bookOpen: ImageVector? = null
