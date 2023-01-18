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

public val IonIcons.RainySharp: ImageVector
    get() {
        if (_rainySharp != null) {
            return _rainySharp!!
        }
        _rainySharp = Builder(name = "RainySharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(364.0f, 336.0f)
                lineTo(130.0f, 336.0f)
                curveToRelative(-29.5f, 0.0f, -54.92f, -7.83f, -73.53f, -22.64f)
                curveTo(35.23f, 296.44f, 24.0f, 271.35f, 24.0f, 240.8f)
                curveToRelative(0.0f, -26.66f, 10.08f, -49.8f, 29.14f, -66.91f)
                curveToRelative(15.24f, -13.68f, 36.17f, -23.21f, 59.0f, -26.84f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.06f, 0.0f, 0.08f, 0.0f, 0.09f, -0.05f)
                curveToRelative(6.44f, -39.0f, 23.83f, -72.09f, 50.31f, -95.68f)
                arcTo(140.24f, 140.24f, 0.0f, false, true, 256.0f, 16.0f)
                curveToRelative(30.23f, 0.0f, 58.48f, 9.39f, 81.71f, 27.17f)
                arcToRelative(142.69f, 142.69f, 0.0f, false, true, 45.36f, 60.66f)
                curveToRelative(29.41f, 4.82f, 54.72f, 17.11f, 73.19f, 35.54f)
                curveTo(477.0f, 160.11f, 488.0f, 187.71f, 488.0f, 219.2f)
                curveToRelative(0.0f, 32.85f, -13.13f, 62.87f, -37.0f, 84.52f)
                curveTo(428.11f, 324.54f, 397.2f, 336.0f, 364.0f, 336.0f)
                close()
                moveTo(383.0f, 103.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(93.819f, 430.422f)
                lineToRelative(49.751f, -74.627f)
                lineToRelative(26.626f, 17.75f)
                lineToRelative(-49.751f, 74.627f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(141.816f, 478.428f)
                lineToRelative(81.752f, -122.628f)
                lineToRelative(26.626f, 17.75f)
                lineToRelative(-81.752f, 122.628f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.811f, 430.424f)
                lineToRelative(49.751f, -74.627f)
                lineToRelative(26.626f, 17.75f)
                lineToRelative(-49.751f, 74.627f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(301.808f, 478.43f)
                lineToRelative(81.752f, -122.628f)
                lineToRelative(26.626f, 17.75f)
                lineToRelative(-81.752f, 122.628f)
                close()
            }
        }
        .build()
        return _rainySharp!!
    }

private var _rainySharp: ImageVector? = null
