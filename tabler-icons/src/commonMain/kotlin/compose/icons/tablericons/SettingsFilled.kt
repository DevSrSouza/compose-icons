package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.SettingsFilled: ImageVector
    get() {
        if (_settingsFilled != null) {
            return _settingsFilled!!
        }
        _settingsFilled = Builder(name = "SettingsFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.647f, 4.081f)
                arcToRelative(0.724f, 0.724f, 0.0f, false, false, 1.08f, 0.448f)
                curveToRelative(2.439f, -1.485f, 5.23f, 1.305f, 3.745f, 3.744f)
                arcToRelative(0.724f, 0.724f, 0.0f, false, false, 0.447f, 1.08f)
                curveToRelative(2.775f, 0.673f, 2.775f, 4.62f, 0.0f, 5.294f)
                arcToRelative(0.724f, 0.724f, 0.0f, false, false, -0.448f, 1.08f)
                curveToRelative(1.485f, 2.439f, -1.305f, 5.23f, -3.744f, 3.745f)
                arcToRelative(0.724f, 0.724f, 0.0f, false, false, -1.08f, 0.447f)
                curveToRelative(-0.673f, 2.775f, -4.62f, 2.775f, -5.294f, 0.0f)
                arcToRelative(0.724f, 0.724f, 0.0f, false, false, -1.08f, -0.448f)
                curveToRelative(-2.439f, 1.485f, -5.23f, -1.305f, -3.745f, -3.744f)
                arcToRelative(0.724f, 0.724f, 0.0f, false, false, -0.447f, -1.08f)
                curveToRelative(-2.775f, -0.673f, -2.775f, -4.62f, 0.0f, -5.294f)
                arcToRelative(0.724f, 0.724f, 0.0f, false, false, 0.448f, -1.08f)
                curveToRelative(-1.485f, -2.439f, 1.305f, -5.23f, 3.744f, -3.745f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, false, 1.08f, -0.447f)
                curveToRelative(0.673f, -2.775f, 4.62f, -2.775f, 5.294f, 0.0f)
                close()
                moveTo(12.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                close()
            }
        }
        .build()
        return _settingsFilled!!
    }

private var _settingsFilled: ImageVector? = null
