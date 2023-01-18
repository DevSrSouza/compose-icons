package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.LanguageSharp: ImageVector
    get() {
        if (_languageSharp != null) {
            return _languageSharp!!
        }
        _languageSharp = Builder(name = "LanguageSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(363.0f, 176.0f)
                lineTo(246.0f, 464.0f)
                horizontalLineToRelative(47.24f)
                lineToRelative(24.49f, -58.0f)
                horizontalLineToRelative(90.54f)
                lineToRelative(24.49f, 58.0f)
                horizontalLineTo(480.0f)
                close()
                moveTo(336.31f, 362.0f)
                lineTo(363.0f, 279.85f)
                lineTo(389.69f, 362.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 320.0f)
                curveToRelative(-0.25f, -0.19f, -20.59f, -15.77f, -45.42f, -42.67f)
                curveToRelative(39.58f, -53.64f, 62.0f, -114.61f, 71.15f, -143.33f)
                horizontalLineTo(352.0f)
                verticalLineTo(90.0f)
                horizontalLineTo(214.0f)
                verticalLineTo(48.0f)
                horizontalLineTo(170.0f)
                verticalLineTo(90.0f)
                horizontalLineTo(32.0f)
                verticalLineToRelative(44.0f)
                horizontalLineTo(251.25f)
                curveToRelative(-9.52f, 26.95f, -27.05f, 69.5f, -53.79f, 108.36f)
                curveToRelative(-32.68f, -43.44f, -47.14f, -75.88f, -47.33f, -76.22f)
                lineTo(143.0f, 152.0f)
                lineToRelative(-38.0f, 22.0f)
                lineToRelative(6.87f, 13.86f)
                curveToRelative(0.89f, 1.56f, 17.19f, 37.9f, 54.71f, 86.57f)
                curveToRelative(0.92f, 1.21f, 1.85f, 2.39f, 2.78f, 3.57f)
                curveToRelative(-49.72f, 56.86f, -89.15f, 79.09f, -89.66f, 79.47f)
                lineTo(64.0f, 368.0f)
                lineToRelative(23.0f, 36.0f)
                lineToRelative(19.3f, -11.47f)
                curveToRelative(2.2f, -1.67f, 41.33f, -24.0f, 92.0f, -80.78f)
                curveToRelative(24.52f, 26.28f, 43.22f, 40.83f, 44.3f, 41.67f)
                lineTo(255.0f, 362.0f)
                close()
            }
        }
        .build()
        return _languageSharp!!
    }

private var _languageSharp: ImageVector? = null
