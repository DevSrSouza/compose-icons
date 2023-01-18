package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.BriefcaseMetal: ImageVector
    get() {
        if (_briefcaseMetal != null) {
            return _briefcaseMetal!!
        }
        _briefcaseMetal = Builder(name = "BriefcaseMetal", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 66.0f)
                horizontalLineTo(174.0f)
                verticalLineTo(56.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, -22.0f, -22.0f)
                horizontalLineTo(104.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, false, 82.0f, 56.0f)
                verticalLineTo(66.0f)
                horizontalLineTo(40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 80.0f)
                verticalLineTo(208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineTo(216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(80.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 66.0f)
                close()
                moveTo(38.0f, 118.0f)
                horizontalLineTo(218.0f)
                verticalLineToRelative(52.0f)
                horizontalLineTo(38.0f)
                close()
                moveTo(94.0f, 56.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, -10.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                verticalLineTo(66.0f)
                horizontalLineTo(94.0f)
                close()
                moveTo(40.0f, 78.0f)
                horizontalLineTo(216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(26.0f)
                horizontalLineTo(38.0f)
                verticalLineTo(80.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 40.0f, 78.0f)
                close()
                moveTo(216.0f, 210.0f)
                horizontalLineTo(40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(182.0f)
                horizontalLineTo(218.0f)
                verticalLineToRelative(26.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 216.0f, 210.0f)
                close()
            }
        }
        .build()
        return _briefcaseMetal!!
    }

private var _briefcaseMetal: ImageVector? = null
