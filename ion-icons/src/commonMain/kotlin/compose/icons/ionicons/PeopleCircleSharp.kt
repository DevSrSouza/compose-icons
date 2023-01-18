package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PeopleCircleSharp: ImageVector
    get() {
        if (_peopleCircleSharp != null) {
            return _peopleCircleSharp!!
        }
        _peopleCircleSharp = Builder(name = "PeopleCircleSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.31f, 48.0f, 48.0f, 141.31f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.31f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.31f, 208.0f, -208.0f)
                reflectiveCurveTo(370.69f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(325.3f, 144.17f)
                arcToRelative(72.5f, 72.5f, 0.0f, true, true, -72.6f, 72.5f)
                arcTo(72.55f, 72.55f, 0.0f, false, true, 325.3f, 144.17f)
                close()
                moveTo(170.2f, 170.53f)
                arcToRelative(59.32f, 59.32f, 0.0f, true, true, -59.4f, 59.32f)
                arcTo(59.35f, 59.35f, 0.0f, false, true, 170.2f, 170.53f)
                close()
                moveTo(94.35f, 325.53f)
                curveToRelative(24.5f, -13.29f, 55.87f, -19.94f, 75.85f, -19.94f)
                curveToRelative(15.0f, 0.0f, 34.32f, 3.0f, 53.33f, 10.2f)
                arcToRelative(133.05f, 133.05f, 0.0f, false, false, -34.0f, 27.11f)
                curveToRelative(-13.19f, 15.0f, -20.76f, 32.92f, -20.76f, 50.83f)
                verticalLineToRelative(15.0f)
                arcTo(177.06f, 177.06f, 0.0f, false, true, 94.35f, 325.58f)
                close()
                moveTo(256.0f, 432.0f)
                arcToRelative(175.12f, 175.12f, 0.0f, false, true, -59.4f, -10.33f)
                lineTo(196.6f, 394.62f)
                curveToRelative(0.0f, -52.59f, 85.75f, -79.09f, 128.7f, -79.09f)
                curveToRelative(23.0f, 0.0f, 58.38f, 7.63f, 86.21f, 22.81f)
                arcTo(176.14f, 176.14f, 0.0f, false, true, 256.0f, 432.0f)
                close()
            }
        }
        .build()
        return _peopleCircleSharp!!
    }

private var _peopleCircleSharp: ImageVector? = null
