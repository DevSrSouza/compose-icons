package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandMeetup: ImageVector
    get() {
        if (_brandMeetup != null) {
            return _brandMeetup!!
        }
        _brandMeetup = Builder(name = "BrandMeetup", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.455f, 10.82f)
                curveToRelative(0.935f, -2.163f, 3.045f, -3.82f, 5.545f, -3.82f)
                curveToRelative(2.104f, 0.0f, 2.844f, 1.915f, 2.0f, 4.0f)
                lineToRelative(-2.0f, 6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.981f, 7.0f)
                lineToRelative(-3.981f, 9.914f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 11.0f)
                curveToRelative(0.937f, -2.16f, 3.071f, -3.802f, 5.42f, -3.972f)
                curveToRelative(2.104f, 0.0f, 3.128f, 1.706f, 2.284f, 3.792f)
                lineToRelative(-2.454f, 6.094f)
                curveToRelative(-0.853f, 1.676f, 0.75f, 2.586f, 2.75f, 2.086f)
            }
        }
        .build()
        return _brandMeetup!!
    }

private var _brandMeetup: ImageVector? = null
