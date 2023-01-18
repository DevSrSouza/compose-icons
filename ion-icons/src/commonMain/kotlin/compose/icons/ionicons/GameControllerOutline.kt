package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.GameControllerOutline: ImageVector
    get() {
        if (_gameControllerOutline != null) {
            return _gameControllerOutline!!
        }
        _gameControllerOutline = Builder(name = "GameControllerOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(467.51f, 248.83f)
                curveToRelative(-18.4f, -83.18f, -45.69f, -136.24f, -89.43f, -149.17f)
                arcTo(91.5f, 91.5f, 0.0f, false, false, 352.0f, 96.0f)
                curveToRelative(-26.89f, 0.0f, -48.11f, 16.0f, -96.0f, 16.0f)
                reflectiveCurveToRelative(-69.15f, -16.0f, -96.0f, -16.0f)
                arcToRelative(99.09f, 99.09f, 0.0f, false, false, -27.2f, 3.66f)
                curveTo(89.0f, 112.59f, 61.94f, 165.7f, 43.33f, 248.83f)
                curveToRelative(-19.0f, 84.91f, -15.56f, 152.0f, 21.58f, 164.88f)
                curveToRelative(26.0f, 9.0f, 49.25f, -9.61f, 71.27f, -37.0f)
                curveToRelative(25.0f, -31.2f, 55.79f, -40.8f, 119.82f, -40.8f)
                reflectiveCurveToRelative(93.62f, 9.6f, 118.66f, 40.8f)
                curveToRelative(22.0f, 27.41f, 46.11f, 45.79f, 71.42f, 37.16f)
                curveTo(487.1f, 399.86f, 486.52f, 334.74f, 467.51f, 248.83f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(292.0f, 224.0f)
                moveToRelative(-20.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 40.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -40.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 288.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -19.95f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 336.0f, 288.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 180.0f)
                moveToRelative(-20.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 40.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -40.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(380.0f, 224.0f)
                moveToRelative(-20.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 40.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -40.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.0f, 176.0f)
                lineTo(160.0f, 272.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 224.0f)
                lineTo(112.0f, 224.0f)
            }
        }
        .build()
        return _gameControllerOutline!!
    }

private var _gameControllerOutline: ImageVector? = null
