package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Square as StrokeCapSquare
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.VolumeMediumSharp: ImageVector
    get() {
        if (_volumeMediumSharp != null) {
            return _volumeMediumSharp!!
        }
        _volumeMediumSharp = Builder(name = "VolumeMediumSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(157.65f, 176.1f)
                lineToRelative(-93.65f, 0.0f)
                lineToRelative(0.0f, 159.8f)
                lineToRelative(93.65f, 0.0f)
                lineToRelative(130.35f, 104.1f)
                lineToRelative(0.0f, -368.0f)
                lineToRelative(-130.35f, 104.1f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(352.0f, 320.0f)
                curveToRelative(9.74f, -19.41f, 16.0f, -40.81f, 16.0f, -64.0f)
                curveToRelative(0.0f, -23.51f, -6.0f, -44.4f, -16.0f, -64.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(400.0f, 368.0f)
                curveToRelative(19.48f, -34.0f, 32.0f, -64.0f, 32.0f, -112.0f)
                reflectiveCurveToRelative(-12.0f, -77.7f, -32.0f, -112.0f)
            }
        }
        .build()
        return _volumeMediumSharp!!
    }

private var _volumeMediumSharp: ImageVector? = null
