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

public val IonIcons.UmbrellaSharp: ImageVector
    get() {
        if (_umbrellaSharp != null) {
            return _umbrellaSharp!!
        }
        _umbrellaSharp = Builder(name = "UmbrellaSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.93f, 280.0f)
                lineToRelative(-0.26f, -0.3f)
                curveToRelative(-0.9f, -0.74f, -1.83f, -1.43f, -2.77f, -2.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(383.08f, 280.0f)
                lineToRelative(2.62f, -2.12f)
                curveToRelative(-0.79f, 0.58f, -1.57f, 1.17f, -2.34f, 1.79f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(463.14f, 186.44f)
                arcTo(224.55f, 224.55f, 0.0f, false, false, 272.0f, 48.57f)
                verticalLineTo(32.0f)
                horizontalLineTo(240.0f)
                verticalLineTo(48.57f)
                arcTo(223.58f, 223.58f, 0.0f, false, false, 32.0f, 272.0f)
                verticalLineToRelative(22.52f)
                lineToRelative(12.25f, -11.21f)
                arcToRelative(62.63f, 62.63f, 0.0f, false, true, 81.43f, -5.88f)
                lineToRelative(0.22f, 0.17f)
                curveToRelative(0.94f, 0.67f, 1.87f, 1.36f, 2.77f, 2.1f)
                quadToRelative(2.09f, 1.69f, 4.0f, 3.61f)
                lineTo(144.0f, 294.63f)
                lineToRelative(11.31f, -11.32f)
                arcToRelative(62.59f, 62.59f, 0.0f, false, true, 81.4f, -5.78f)
                lineTo(240.0f, 280.0f)
                verticalLineTo(432.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                verticalLineTo(416.0f)
                horizontalLineTo(176.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 96.0f, 0.0f)
                verticalLineTo(280.0f)
                lineToRelative(3.29f, -2.47f)
                arcToRelative(62.59f, 62.59f, 0.0f, false, true, 81.4f, 5.78f)
                lineTo(368.0f, 294.63f)
                lineToRelative(11.31f, -11.32f)
                quadToRelative(1.95f, -1.94f, 4.05f, -3.64f)
                curveToRelative(0.77f, -0.62f, 1.55f, -1.21f, 2.34f, -1.79f)
                lineToRelative(0.26f, -0.21f)
                curveToRelative(24.63f, -18.47f, 60.0f, -16.13f, 81.81f, 5.64f)
                lineTo(480.0f, 294.51f)
                verticalLineTo(272.0f)
                arcTo(223.62f, 223.62f, 0.0f, false, false, 463.14f, 186.44f)
                close()
            }
        }
        .build()
        return _umbrellaSharp!!
    }

private var _umbrellaSharp: ImageVector? = null
