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

public val IonIcons.InformationCircleOutline: ImageVector
    get() {
        if (_informationCircleOutline != null) {
            return _informationCircleOutline!!
        }
        _informationCircleOutline = Builder(name = "InformationCircleOutline", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight =
                512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(248.0f, 64.0f)
                curveTo(146.39f, 64.0f, 64.0f, 146.39f, 64.0f, 248.0f)
                reflectiveCurveToRelative(82.39f, 184.0f, 184.0f, 184.0f)
                reflectiveCurveToRelative(184.0f, -82.39f, 184.0f, -184.0f)
                reflectiveCurveTo(349.61f, 64.0f, 248.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(220.0f, 220.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, 116.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 340.0f)
                lineTo(296.0f, 340.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 130.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, 26.0f, 26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 248.0f, 130.0f)
                close()
            }
        }
        .build()
        return _informationCircleOutline!!
    }

private var _informationCircleOutline: ImageVector? = null
