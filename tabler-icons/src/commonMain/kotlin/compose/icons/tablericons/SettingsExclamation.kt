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

public val TablerIcons.SettingsExclamation: ImageVector
    get() {
        if (_settingsExclamation != null) {
            return _settingsExclamation!!
        }
        _settingsExclamation = Builder(name = "SettingsExclamation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.004f, 18.401f)
                arcToRelative(1.724f, 1.724f, 0.0f, false, false, -1.329f, 1.282f)
                curveToRelative(-0.426f, 1.756f, -2.924f, 1.756f, -3.35f, 0.0f)
                arcToRelative(1.724f, 1.724f, 0.0f, false, false, -2.573f, -1.066f)
                curveToRelative(-1.543f, 0.94f, -3.31f, -0.826f, -2.37f, -2.37f)
                arcToRelative(1.724f, 1.724f, 0.0f, false, false, -1.065f, -2.572f)
                curveToRelative(-1.756f, -0.426f, -1.756f, -2.924f, 0.0f, -3.35f)
                arcToRelative(1.724f, 1.724f, 0.0f, false, false, 1.066f, -2.573f)
                curveToRelative(-0.94f, -1.543f, 0.826f, -3.31f, 2.37f, -2.37f)
                curveToRelative(1.0f, 0.608f, 2.296f, 0.07f, 2.572f, -1.065f)
                curveToRelative(0.426f, -1.756f, 2.924f, -1.756f, 3.35f, 0.0f)
                arcToRelative(1.724f, 1.724f, 0.0f, false, false, 2.573f, 1.066f)
                curveToRelative(1.543f, -0.94f, 3.31f, 0.826f, 2.37f, 2.37f)
                arcToRelative(1.724f, 1.724f, 0.0f, false, false, 1.065f, 2.572f)
                curveToRelative(1.079f, 0.262f, 1.495f, 1.305f, 1.248f, 2.17f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 16.0f)
                verticalLineToRelative(3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 22.0f)
                verticalLineToRelative(0.01f)
            }
        }
        .build()
        return _settingsExclamation!!
    }

private var _settingsExclamation: ImageVector? = null
